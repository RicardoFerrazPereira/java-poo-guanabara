package br.com.aula7lutador;

public class Principal {

	public static void main(String[] args) {
		
//		Lutador a1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
//		Lutador a2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
//		Lutador a3 = new Lutador("Snapshadow", "EUA" , 35, 1.65f, 80.9f, 12, 2, 1);
//		Lutador a4 = new Lutador("Dead Code", "Autrália", 28, 1.93f, 81.6f, 13, 0, 2);
//		Lutador a5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
//		Lutador a6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
				
// Cadastrar os lutadores por vetor.
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA" , 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Autrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		

//		l[0].apresentar();
//		l[2].status();
//		l[3].setPeso(60);
//		l[3].ganharLuta();
//		l[3].empatarLuta();
//		l[3].perderLuta();
//		l[3].status();
		
		
	
		Luta UFC01 = new Luta();
		UFC01.marcarLutas(l[2], l[5]);
		UFC01.lutar();
		l[2].status();
		l[3].status();
	
	}
	
	

}
