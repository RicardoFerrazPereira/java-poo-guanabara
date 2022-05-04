package br.com.aula12polimorfismosobreposicao;

public class Ave extends Animal{
	// Atributo de Ave
	private String corPena;

	//M�todos herdados da classe Pai (Animal)
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}
	
	// M�todo Pr�prio da Ave
	
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	
	// Getters e Setters
	
	public String getCorPena() {
		return corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
