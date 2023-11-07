package it.formazione.libreria.controller;

import it.formazione.libreria.controller.DTO.AuthorAndBookDTO;
import it.formazione.libreria.mybatis.mapper.AutoriMapper;
import it.formazione.libreria.mybatis.mapper.LibriMapper;
import it.formazione.libreria.mybatis.model.Autori;
import it.formazione.libreria.mybatis.model.AutoriExample;
import it.formazione.libreria.mybatis.model.Libri;
import it.formazione.libreria.mybatis.model.LibriExample;
import jakarta.websocket.server.PathParam;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Servizi REST per gestione della tabella libri
 */
@RestController
@RequestMapping("/autori")
public class AutoriController {
	
	@Autowired
	private AutoriMapper autoriMapper;

	@Autowired
	private LibriMapper libriMapper;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;


	@GetMapping(value = "/selectAll", produces = "application/json")
	public List<Autori> selectAll() {
		return this.autoriMapper.selectByExample(new AutoriExample());
	}
	
	@GetMapping(value = "/selectById", produces = "application/json")
	public Autori selectById(@PathParam("id") Integer id) {
		return this.autoriMapper.selectByPrimaryKey(id);
	}


	/**
	 * TODO dopo join autori e numero di libri
	 */
//	@GetMapping(value = "selectByNumberOfBooksGreaterThan/{num}")
//	public List<Libri> selectByNumberOfBooksGreaterThan(@PathVariable Integer num){
//		AutoriExample example = new AutoriExample();
//		example.createCriteria().andNumeroDiLibri(num);
//		return this.autoriMapper.selectByExample(example);
//	}

	
	@PostMapping(value = "/insertAutore", produces = "application/json")
	public Autori addAutore(@RequestBody Autori autore) {
		this.autoriMapper.insert(autore);
		return autore;
	}

	@PostMapping(value = "/inserAutori", produces = "application/json")
	public List<Autori> addAutori(@RequestBody List<Autori> autori) {
		for(Autori autore : autori){
			this.autoriMapper.insert(autore);
		}
		return autori;
	}


	@PutMapping(value = "/update", produces = "application/json")
	public Autori editAutoreName(@RequestParam("id") Integer id, @RequestParam("newName") String newName){
		Autori autoreToUpdate = this.autoriMapper.selectByPrimaryKey(id);
		autoreToUpdate.setNomeAutore(newName);
		this.autoriMapper.updateByPrimaryKey(autoreToUpdate);
		return autoreToUpdate;
	}


	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteAutore(@PathVariable("id")Integer id){
		Autori autoreToDelete = this.autoriMapper.selectByPrimaryKey(id);
		if(autoreToDelete != null){
			autoriMapper.deleteByPrimaryKey(id);
			return ResponseEntity.status(HttpStatus.OK).body("Book deleted");
		}else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cannot delete");
		}
	}

	@DeleteMapping(value = "/deleteall")
	public ResponseEntity<?> deleteAll(){
	try{
		autoriMapper.deleteByExample(new AutoriExample());
		return ResponseEntity.status(HttpStatus.OK).body("Autori table cleared");
	}catch (Exception e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
	}

	/**
	 * Con opensession() e close()
	 */

	@PostMapping(value = "/insertNewAutoreWithBook", produces = "application/json")
	public ResponseEntity addNewAutoreAndBook(@RequestBody AuthorAndBookDTO authorAndBookDTO) {

		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			Autori newAutore = new Autori();
			newAutore.setNomeAutore(authorAndBookDTO.getNomeAutore());
			Libri newLibro = new Libri();
			newLibro.setNome(authorAndBookDTO.getBookName());
			newLibro.setPrezzo(authorAndBookDTO.getPrezzo());
			newLibro.setAutoreId(authorAndBookDTO.getAutoreId());
			this.autoriMapper.insert(newAutore);
			this.libriMapper.insert(newLibro);
			sqlSession.commit();
			return ResponseEntity.status(HttpStatus.CREATED).body(authorAndBookDTO);
		}catch (Exception e){
			sqlSession.rollback();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		} finally {
			sqlSession.close();
		}
	}



	/**
	 * TODO metodo che retrieva tutti i libri in base ad 1 autore, definito gia in autorimapper.xml
	 la query (controllala) ed il metodo in autorimappa (interface)
	 */

//	@GetMapping(value = "/allBooks", produces="application/json")
//	public List<Libri>getAuthorBooks(@PathParam("id") Integer id){
//		return this.autoriMapper.selectAutoriWithLibri(id);
//	}

	@GetMapping(value = "/allBooks", produces="application/json")
	public List<Libri>getAuthorBooks(@PathParam("id") Integer id, @PathParam("prezzo") Integer prezzo){

		List<Libri>libriAutore = this.autoriMapper.selectAutoriWithLibri(id, prezzo);

//		for (Libri l:libriAutore) {
//
//			int n = libriMapper.selectLibroById(l.getNome());
//
//			l.setId(n);
//		}

	return libriAutore;
	}




}
