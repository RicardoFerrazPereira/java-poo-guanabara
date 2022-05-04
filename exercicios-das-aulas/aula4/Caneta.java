package br.com.aula4;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
//		System.out.println("SOBRE A CANETA:");
//		System.out.println("Modelo: " + this.modelo);   // forma normal
//		System.out.println("Ponta: " + this.ponta);     // forma normal
//		System.out.println("Cor: " + this.cor);			// forma normal
//		System.out.println("Tampada: " + this.tampada); // forma normal
		
		System.out.println("Modelo: " + this.getModelo());   // forma com getters
		System.out.println("Ponta: " + this.getPonta());     // forma com getters
		System.out.println("Cor: " + this.getCor());		 // forma com getters
		System.out.println("Tampada: " + this.getTampada()); // forma com getters

	}
}
