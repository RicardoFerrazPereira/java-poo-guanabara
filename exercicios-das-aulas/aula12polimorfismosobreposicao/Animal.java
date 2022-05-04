package br.com.aula12polimorfismosobreposicao;

public abstract class Animal {
	// atributos de Animal
	protected float peso;			  // protected - para poder usar nas filhas
	protected int idade;
	protected int membros;
	// Métodos de Animal
	public abstract void locomover(); // metodo abstrato não é representado por meio de codigo, 
	public abstract void alimentar(); // então vai ter simplismente o seu nome. Só as FILHAS vão
	public abstract void emitirSom(); // ser OBRIGADAS A DESENVOLVER
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	public String toString() {
		return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	

}
// sempre que eu tiver metodos abstratos a classe tambem sera abstrata.
//"classe abstrata" é aquela que não pode virar um objeto, não consigo 
//trasformar essa classe em objeto. Só vai servir para efeito de "herança".