package br.com.aula5conta;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String nome;
	private double saldo;
	private boolean statusConta;
	
//	CONSTRUTOR
	
	public Conta() {
		this.setSaldo(0);
		this.setStatusConta(false);
	}	
//	public Conta() {
//		this.saldo = 0;
//		this.statusConta = false;
//	}
	

//	GET E SET
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
//	MÉTODOS
	
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatusConta(true);
		if (tipoConta == "CC") {
			this.setSaldo(50);
		}
		else if (tipoConta == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, pois tem débito");
		}else {
			this.setStatusConta(false);
			System.out.println("Conta fechada com sucesso");
		}
		
	}
	
	public void depositar(double valor) {
		//if (statusConta == true) {
		//this.saldo += valor;
		if (this.getStatusConta()) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getNome());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
			
				
	}
	
	public void sacar(double valor) {
//		if (this.statusConta == true) {
//			if (this.saldo > valor) {
//				this.saldo -= valor;
//				System.out.println("Saque realizado na conta de " + this.nome);
//			}
//		}
		
		if (this.getStatusConta()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.nome);
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int valor = 0;
		if (this.tipoConta == "CC") {
		valor = 12;
		} else if (this.tipoConta == "CP") {
		  valor = 20;
		}
		if (this.statusConta == true) {
			if (this.saldo > valor) {
				this.saldo -= valor;
				System.out.println("Mensalidade paga com sucesso por " + this.nome);
			}else {
				System.out.println("Impossível pagar com conta fechada");
			}
			
		}
		
	}
	
	
	
	
	public void leitura() {
		System.out.println("-----------------------------");
		System.out.println("Número: " + this.numConta);
		System.out.println("Tipo: " + this.tipoConta);
		System.out.println("Nome: " + this.nome);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.statusConta);
				
	}
//	CONSTRUTOR

//	public Conta(double saldo, boolean statusConta) {
//		super();
//		this.saldo = saldo;
//		this.statusConta = statusConta;
//	}
	
	

}
