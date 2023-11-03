package it.formazione.libreria;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * MapperScan -> package contenente le interfaccie Mapper delle tabelle
 */
@MapperScan(basePackages = { "it.formazione.libreria.mybatis.mapper" })
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

}
