package br.com.aula12polimorfismosobreposicao;

public class Cachorro extends Mamifero {
	
	public void enterrarOsso() {
		System.out.println("Enterrei o osso");
		
	}
//	@Override
//	public void locomover() {
//		System.out.println("Andar");
//  
// }

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
}
// se eu n�o colocar nenhum m�todo da classe pai. automaticamente ele puxa os valores
// dos m�todos da claase pai. exemplo: "emitirSom", se eu n�o colocar esse m�todo aqui 
// em cachorro, quando eu chamar la na classe principal, vai aparecer emitirSom da classe pai(mamifero)
// que � "correndo"