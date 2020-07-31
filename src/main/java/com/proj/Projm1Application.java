package com.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Projm1Application implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(Projm1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Projm1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o run");
		int valor = 4;
		
		Curso c = new Curso();
		c.mostraDados();
		LOG.info("Finalizando o run");
		LOG.warn("Finalizando o run");
		LOG.debug("Finalizando o run");
		LOG.error("Finalizando o run");
	
	
		
	}

}
