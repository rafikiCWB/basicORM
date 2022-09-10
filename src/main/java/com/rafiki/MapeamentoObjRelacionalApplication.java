package com.rafiki;

import com.rafiki.entidades.Colaborador;
import com.rafiki.repositorios.ColaboradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MapeamentoObjRelacionalApplication implements CommandLineRunner {

    @Autowired
    public ColaboradorRepositorio repository;

    public static void main(String[] args) {
        SpringApplication.run(MapeamentoObjRelacionalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Colaborador> result = repository.findAll();

        for (Colaborador emp : result) {
            System.out.println(emp);
        }
    }
}