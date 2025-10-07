package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	Curso curso1 = new Curso();
    	curso1.setTitulo("curso java");
    	curso1.setDescricao("descricao java");
    	curso1.setCarga_horaria(8);
    	System.out.println(curso1);
    	
    	Curso curso2 = new Curso();
    	curso2.setTitulo("curso javascript");
    	curso2.setDescricao("descricao javascript");
    	curso2.setCarga_horaria(6);
    	System.out.println(curso2);
    	
    	Mentoria mentoria = new Mentoria("mentoria de java", "descricao", LocalDate.now());
    	System.out.println(mentoria);
    	

    }

}
