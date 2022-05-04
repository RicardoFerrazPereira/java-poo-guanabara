package br.com.aula11heranca;

public class Bolsita extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.nome);
	}
	@Override
	public void pagarMens() {  // pagar mensalidade de um bolsista é diferente de pagar mensalidade
		System.out.println(this.nome + " é bolsista! Pagamento diferenciado");					   // de aluno, então vamos sobrepor ou subescrever o método.
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
