package br.com.aula11heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAum(float aum) {
		this.salario += aum;
		System.out.println("Parab�ns! Voc� recebeu um aumento salarial!");
		
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}
	
}
