package br.com.aula10heranca;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		p3.setIdade(52);	
		
//		p1.receberAum(550.20f);  obs. receberAum() n�o faz parte de p1 (pessoa)
//		p2.mudarTrabalho();      obs. mudarTrab() n�o faz parte de p2(aluno)
//		p4.cancelarMatr();       obs. cancelaMatr() n�o faz parte de p4(funcionario)
				
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());		
		System.out.println(p4.toString());
		
		
	
		
		
		
		
		

	}

}
