package it.formazione.libreria.controller;

import it.formazione.libreria.controller.DTO.AuthorAndBookDTO;
import it.formazione.libreria.mybatis.mapper.AutoriMapper;
import it.formazione.libreria.mybatis.mapper.LibriMapper;

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







}
