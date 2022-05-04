package br.com.cloneaula9;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] p  = new Pessoa[3];
				
		p[0] = new Pessoa("Farroch", 34, "M");
		p[1] = new Pessoa("Ziva", 30, "F");
		p[2] = new Pessoa("Sete", 25, "F");
		
		Livro[] l = new Livro[3];
		
		l[0] = new Livro("O Gato de Botas", "Gatuno", 150, p[0]);
		l[1] = new Livro("A mais Bonita", "Pretusca", 190, p[1]);
		l[2] = new Livro("Nariz Marrom", "Sereré", 200, p[2]);
		
		
		System.out.println(l[0].detalhes());
		l[0].abrir();
		l[0].folhear(10);
		l[0].voltarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[2].detalhes());
		System.out.println(l[1].detalhes());
		
		
		

	}

}
