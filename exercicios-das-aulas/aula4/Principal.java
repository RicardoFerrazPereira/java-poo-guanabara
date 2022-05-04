package br.com.aula4;

public class Principal {

	public static void main(String[] args) {
//		Caneta c1 = new Caneta();
//		c1.modelo = "NIC"; // criei caneta modo normal. Não usei "set", pois está "public"
//		c1.setCor("Roxo"); // criei caneta modo normal. Usei "set", pois a visibilidade é "private"
//		c1.setPonta(1.8f); // criei caneta modo normal. Não usei "set", pois está "public"
//		c1.tampar();	   // chamei método "tampar" . pra caneta vir tampada.	
		
		
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); // criando caneta no modo construtor
		c1.status();
		Caneta c2 = new Caneta("KIK", "Laranja", 1.5f); // criando outra caneta no modo construtor
		c2.status();
		
		
		//c1.setModelo("BIC");
		// c1.modelo = "BIC";
		
		//c1.setPonta(0.5f); // em java, tenho que colocar o f depois do numero para indicar que é float
		//c1.ponta = 0.5f; // vai dar erro pois o atributo é private
		//c1.status();
		
		//System.out.println("Tenho uma caneta " + c1.modelo + " de ponta: " + c1.getPonta());
		// pra consultar o "modelo" da caneta, chamei normal (c1.modelo), pois é public.
		// pra consultar a "ponta" tive que chamar pelo "get" (c1.getPonta()), pois a visibilidade é "private"
	}

}
