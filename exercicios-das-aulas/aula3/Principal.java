package br.com.aula3;

public class Principal {

	public static void main(String[] args) {
        Caneta c1 = new Caneta();
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5; // private, n�o tem acesso.
		c1.carga = 80;
		//c1.tampada = true; // private, na� tem acesso.
		c1.tampar();
		c1.status();
		c1.rabiscar();

	}

}
