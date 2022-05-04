package br.com.projetofinal;

public class Usuario extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	// Construtor
	
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

		
	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public int getTotAssistido() {
		return totAssistido;
	}



	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}



	public void viuMaisUm() {
		
	}


	@Override
	public String toString() {
		return "Usuário \n" + super.toString() + "\nlogin: " + login + ", totAssistido: " + totAssistido;
	}
		// coloquei um "super.toString" para puxar as informações de "Pessoa" que é o nosso "super"
}
