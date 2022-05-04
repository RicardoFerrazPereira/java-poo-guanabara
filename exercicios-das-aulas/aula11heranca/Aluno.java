package br.com.aula11heranca;

public class Aluno extends Pessoa {   // se eu colocar a classe como "final" ela n�o poder� ser herdada por outra classe, ou seja, n�o poder� ter  
	private int matricula;			  // filhos.  Vai dar erro na classe "Bolsista"
	private String curso;
	
	public void pagarMens() { // se eu colocar o m�todo "final" antes de "void",n�o vou poder sobrescrever o "pagarMens" l� na classe "Bolsista"
		System.out.println("Pagando mensalidade do aluno: " + this.nome); //posso chamar sem colocar o "get"	
	}																	  //pois mudei a visibilidade para	
																		  //"protected", protected s� posso 
	public int getMatricula() {											  // mecher na pr�pria classe e na
		return matricula;                                                 // "classe m�e";
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
