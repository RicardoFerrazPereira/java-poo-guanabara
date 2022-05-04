package br.com.aula9exercicio;

public interface Publicacao {
	
	public void abrir(); 
	public void fechar();
	public void folhear(int p); // folhear até que página
	public void avancarPag();
	public void voltarPag();
	
}
