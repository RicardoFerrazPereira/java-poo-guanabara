package br.com.aula11heranca;

public class Aluno extends Pessoa {   // se eu colocar a classe como "final" ela não poderá ser herdada por outra classe, ou seja, não poderá ter  
	private int matricula;			  // filhos.  Vai dar erro na classe "Bolsista"
	private String curso;
	
	public void pagarMens() { // se eu colocar o método "final" antes de "void",não vou poder sobrescrever o "pagarMens" lá na classe "Bolsista"
		System.out.println("Pagando mensalidade do aluno: " + this.nome); //posso chamar sem colocar o "get"	
	}																	  //pois mudei a visibilidade para	
																		  //"protected", protected só posso 
	public int getMatricula() {											  // mecher na própria classe e na
		return matricula;                                                 // "classe mãe";
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
