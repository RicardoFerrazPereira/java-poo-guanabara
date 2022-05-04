package br.com.aula11heranca;

public class Bolsita extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.nome);
	}
	@Override
	public void pagarMens() {  // pagar mensalidade de um bolsista � diferente de pagar mensalidade
		System.out.println(this.nome + " � bolsista! Pagamento diferenciado");					   // de aluno, ent�o vamos sobrepor ou subescrever o m�todo.
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
