package br.com.aula11heranca;

public class Principal {

	public static void main(String[] args) {

//		Pessoa p1 = new Pessoa(); obs. classe "Pessoa" não pode ser instanciada, pois é "Abstract"

		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Kiko");
		a1.setMatricula(1111);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMens();
		
		Bolsita b1 = new Bolsita();
		b1.setMatricula(1112);
		b1.setNome("Chaves");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMens();
		
		Professor p1 = new Professor();
		p1.setNome("Girafales");
		p1.setEspecialidade("Matemática");
		p1.setIdade(55);
		p1.setSalario(3000);
		p1.setSexo("M");
		p1.receberAum(500);
		
		System.out.println(p1.toString());
				
		Tecnico t1 = new Tecnico();
		t1.setNome("Chiquinha");
		t1.setIdade(20);
		t1.setSexo("F");
		t1.setRegistroProf(5263);
		
		System.out.println(t1.toString());
		
		
	}

}
