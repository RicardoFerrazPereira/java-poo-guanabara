package br.com.aula13poliformismosobrecarga;

public class Principal {

	public static void main(String[] args) {
		
//		Mamifero m = new Mamifero();
//		m.emitirSom();
//		Lobo l = new Lobo();
//		l.emitirSom();
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		
		c.reagir("Ol�");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
		

	}

}
