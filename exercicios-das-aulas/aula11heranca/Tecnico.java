package br.com.aula11heranca;

public class Tecnico extends Aluno {
	private int registroProf;
		
	public void praticar() {
		System.out.println("Estou praticando!");
	}

	public int getRegistroProf() {
		return registroProf;
	}

	public void setRegistroProf(int registroProf) {
		this.registroProf = registroProf;
	}
	

}
