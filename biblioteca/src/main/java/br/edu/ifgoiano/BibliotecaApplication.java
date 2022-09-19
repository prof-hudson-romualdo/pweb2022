package br.edu.ifgoiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.repository.LivroRepository;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{

	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Criar registros de Livros
		Livro livro1 = new Livro();
		livro1.setNome("Java para Leigos");
		livro1.setAutor("Acsa");
		livro1.setIsbn("123456");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Hudson Romualdo");
		livro2.setNome("Como NÃO ficar com desenvolvimento de software");
		livro2.setIsbn("23232");
		
		livroRepository.save(livro1);
		livroRepository.save(livro2);
	}

}