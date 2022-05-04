package br.com.aula13poliformismosobrecarga;

public class Cachorro extends Lobo {
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase == "Olá") { // pode usar o equals ou "==". Melhor usar equals para Strings
			System.out.println("Abanar e latir");
	    }else { 
		   System.out.println("Rosnar");
	    }
	}	
	public void reagir (int hora, int min) {
		if (hora < 12 ) {
			System.out.println("Abanar");
		}else if (hora >= 18) {
			System.out.println("ignorar");
		}else {
			System.out.println("Abanar e latir");
		}
	}	
	public void reagir (Boolean dono) {
		if (dono) {
			System.out.println("abanar");
		}else {
			System.out.println("rosnar e latir");
			this.emitirSom();
		}
	}
	public void reagir (int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("abanar");
			}else {
				System.out.println("Latir");
			}
		}else {
			if (peso < 10) {
				System.out.println("rosnar");
			}else {
				System.out.println("ignorar");
				}
			}
		}
	}

	   
	

