package br.com.projetofinal;

public class Video implements AcoesVideo {
	
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	// CONSTRUTOR - Construtor � o m�todo que � executado assim que se inst�ncia um objeto.
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	// GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {   
		int nova;
		nova = (this.avaliacao + avaliacao)/this.views; // avalia��o do video, vai ser a media de visualiza��es dele.
		this.avaliacao = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	// M�TODOS SOBREPOSTOS DA INTERFACE
	@Override
	public void play() {
		this.reproduzindo = true;
			
	}
	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}
	@Override
	public void like() {
		this.curtidas++;
		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	

}
