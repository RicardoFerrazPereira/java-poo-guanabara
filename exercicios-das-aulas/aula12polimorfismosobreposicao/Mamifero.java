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
		System.out.println("Som de mamífero");
		
	}
	
		
	
}
// na "classe mãe" (Animal) eu tenho 3 métodos abstratos, quando
// eu tenho métodos abstratos eu sou obrigado a desenvolvelos.