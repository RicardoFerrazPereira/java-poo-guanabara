package br.com.aula10heranca;

public class Professor extends Pessoa {
	private String especialdade;
	private float salario;
	
	public void receberAum(float aum) {
		this.salario += aum;
	
	}

	public String getEspecialdade() {
		return especialdade;
	}

	public void setEspecialdade(String especialdade) {
		this.especialdade = especialdade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
