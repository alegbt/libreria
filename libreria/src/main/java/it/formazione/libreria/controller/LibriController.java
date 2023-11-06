package it.formazione.libreria.controller;

import java.util.List;

import it.formazione.libreria.controller.DTO.AuthorAndBookDTO;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import it.formazione.libreria.mybatis.mapper.LibriMapper;
import it.formazione.libreria.mybatis.model.Libri;
import it.formazione.libreria.mybatis.model.LibriExample;
import jakarta.websocket.server.PathParam;

/**
 * Servizi REST per gestione della tabella libri
 */
@RestController
@RequestMapping("/libri")
public class LibriController {
	
	@Autowired
	private LibriMapper libriMapper;


	/**
	 * Lettura di tutte le righe
	 * @return
	 */
	@GetMapping(value = "/selectAll", produces = "application/json")
	public List<Libri> selectAll() {
		return this.libriMapper.selectByExample(new LibriExample());
	}
	
	@GetMapping(value = "/selectById", produces = "application/json")
	public Libri selectById(@PathParam("id") Integer id) {
		return this.libriMapper.selectByPrimaryKey(id);
	}


	@GetMapping(value = "selectByPriceGreaterThan/{price}")
	public List<Libri> selectByPriceGreaterThan(@PathVariable Integer price){
		LibriExample example = new LibriExample();
		example.createCriteria().andPrezzoGreaterThan(price);
		return this.libriMapper.selectByExample(example);
	}

	
	@PostMapping(value = "/insertBook", produces = "application/json")
	public Libri addBook(@RequestBody Libri libro) {
		this.libriMapper.insert(libro);
		return libro;
	}

	@PostMapping(value = "/insertBooks", produces = "application/json")
	public List<Libri> addBooks(@RequestBody List<Libri> libri) {
		for(Libri libro : libri){
			this.libriMapper.insert(libro);
		}
		return libri;
	}


	@PutMapping(value = "/update", produces = "application/json")
	public Libri editBookName(@RequestParam("id") Integer id, @RequestParam("newName") String newName){
		Libri bookToUpdate = this.libriMapper.selectByPrimaryKey(id);
		bookToUpdate.setNome(newName);
		this.libriMapper.updateByPrimaryKey(bookToUpdate);
		return bookToUpdate;
	}


	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id")Integer id){
		Libri bookToDelete = this.libriMapper.selectByPrimaryKey(id);
		if(bookToDelete != null){
			libriMapper.deleteByPrimaryKey(id);
			return ResponseEntity.status(HttpStatus.OK).body("Book deleted");
		}else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cannot delete");
		}
	}

	@DeleteMapping(value = "/deleteall")
	public ResponseEntity<?> deleteAll(){
	try{
		libriMapper.deleteByExample(new LibriExample());
		return ResponseEntity.status(HttpStatus.OK).body("Libri table cleared");
	}catch (Exception e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
	}

	/**
	 * TODO metodo che retrieva tutti i libri in base ad 1 autore, definito gia in autorimapper.xml
	 		la query (controllala) ed il metodo in autorimappa (interface)
	 */






}
