package br.com.projetofinal;

public class ProjetoYouTube {

	public static void main(String[] args) {
		
		// Criação de objetos normal
//		Video v = new Video("Java Poo");
//		Video v1 = new Video("Banco de Dados");
//		Video v2 = new Video("Portugol");
//		
//		System.out.println(v.toString());
//		System.out.println(v1.toString());
//		System.out.println(v2.toString());
		
		
		
		// Criação de objetos por Vetores
		Video v[] = new Video[3];
		v[0] = new Video("Java Poo");
		v[1] = new Video("Banco de Dados");
		v[2] = new Video("Portugol");
		
		Usuario g[] = new Usuario[3];
		g[0] = new Usuario("Farroch", 1, "M", "bulssara");
		g[1] = new Usuario("Ziva", 12, "F", "zizi");
		g[2] = new Usuario("Sete", 8, "F", "serere");
		
//		System.out.println(g[0].toString());
//		System.out.println(v1.toString());
//		System.out.println(v2.toString());
		Visualizacao vis[] = new Visualizacao[5];
//		vis[0] = new Visualizacao(g[0], v[2]);	   // Farroch assiste Portugol
//		vis[0].avaliar();                          // vai atribuir nota 5
//		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);     // Farroch assiste Banco de dados
		vis[1].avaliar(50f);                        // vai atribuir o valor corrensponde a 50%
		System.out.println(vis[1].toString());
		
//		vis[2] = new Visualizacao(g[0], v[0]);
//		vis[2].avaliar(95);
//		System.out.println(vis[2].toString());
		
				
		vis[3] = new Visualizacao(g[1], v[1]);
		vis[3].avaliar(45);
		vis[3].
		System.out.println(vis[3].toString());
		
		System.out.println(v[1].toString());
	}

}
