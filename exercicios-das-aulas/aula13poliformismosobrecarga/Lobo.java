package br.com.aula13poliformismosobrecarga;

public class Lobo extends Mamifero {
	public void reagir() {
		System.out.println("atacar");
	}
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuuuuuu");
	}

}
