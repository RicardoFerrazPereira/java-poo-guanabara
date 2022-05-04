package br.com.aula12polimorfismosobreposicao;

public class Poliorfismo {

	public static void main(String[] args) {
		
		// Animal n = new Animal(); // Animal é uma classe abstrada, não pode ser instanciada (virar objeto)
		
		Mamifero m = new Mamifero();
				
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		m.toString();
		
		Reptil r = new Reptil();
		
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		r.toString();
		
		Peixe p = new Peixe();
		
		p.locomover();
		p.alimentar();
		p.emitirSom();
		
		Ave a = new Ave();
		
		a.locomover();
		a.alimentar();
		a.emitirSom();
		
		Canguru c = new Canguru();
		
		Cachorro ca = new Cachorro();
		
		Cobra co = new Cobra();
		
		Tartaruga t = new Tartaruga();
		
		Goldfish g = new Goldfish();
		
		Arara ar = new Arara();
		
		c.locomover(); // vai aparecer "correndo" vamos sobreescrever esse método lá na classe canguru
		ca.locomover();
		c.emitirSom();
		ca.emitirSom();
	}

}
