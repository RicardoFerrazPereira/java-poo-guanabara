package br.com.aula12polimorfismosobreposicao;

public class Mamifero extends Animal {

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero");
		
	}
	
		
	
}
// na "classe m�e" (Animal) eu tenho 3 m�todos abstratos, quando
// eu tenho m�todos abstratos eu sou obrigado a desenvolvelos.