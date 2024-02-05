package it.formazione.libreria.controller;

import java.util.List;

import it.formazione.libreria.mybatis.mapper.LibriMapper;
import it.formazione.libreria.mybatis.model.Libri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Servizi REST per gestione della tabella libri
 */
@RestController
@RequestMapping("/libri")
public class LibriController {
	
	@Autowired
	private LibriMapper libriMapper;

    @GetMapping(value = "/selectAll", produces = "application/json")
    public List<Libri> selectAll() {
        return libriMapper.selectAll();
    }




}
