package com.example.aula06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula06Application {

    public static void main(String[] args) {
        SpringApplication.run(Aula06Application.class, args);
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();

    }

}
