package br.com.projetofinal;

public class Visualizacao {		// AGREGAÇÂO: criei uma classe "visualização" para poder ligar a classe "Usuário" a classe "Video"
	private Usuario espectador; // assim que é feita a agregação, colocando o nome da classe do espectador, que é "usuário"
	private Video filme;		// assim que é feita a agregação, colocando o nome da classe do filme, que é "video"
	
	// CONSTRUTOR
	public Visualizacao(Usuario espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); // filmes que o espectador (usuario) viu
		this.filme.setViews(this.filme.getViews() + 1);
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		int t = 0;                      // parâmetro interno "t"
		if (porc <= 20) {
			t = 3;
		}else if (porc <= 50) {
			t = 5;
		}else if (porc <= 90) {
			t = 8;
		}else {
			t = 10;
		}
		this.filme.setAvaliacao(t);
	}
	
	// GETTERS E SETTERS
	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualização: " + espectador + "\nfilme: " + filme;
	}
	
	

}
