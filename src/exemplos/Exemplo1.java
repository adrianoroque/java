package exemplos;

import javax.swing.SingleSelectionModel;

public class Exemplo1 {
	public static void main(String args[]) {
		
		
		//Tipos primitivos de números inteiros
		int numero1 = 30;
		long numero2 = 10L;
		
		//Tipos primitivos de números decimais
		float numero3 = 35.5f;
		double numero4 = 51.2;
		
		int soma = numero1 + (int)numero2;
		
		//Classe que representa as strings
		String nome = "Adriano";
		
		//Tipo primitivo caractere
		char letra = 'b';
		
		//Tipo primitivo lógico
		boolean ehMaior = true;
		
		if (numero1 < 3) {
			System.out.println("Parabéns");
		}else if (numero1 < 7 && numero2 > 15) {
			
		}else {
			
		}
		
		switch (nome) {
		case "jose":
			System.out.println("numero 2");
			break;
		case "pedro":
			System.out.println("numero 3");
			break;
		default:
			System.out.println("outro numero");
			
					
			
		}
			for (int i=0 ; i < 5; i++) {
				System.out.println(i);
			}
			while(numero1 >= 20) {
				System.out.println(numero1);
				numero1--;
			}
			
		System.out.println(soma);
	}

}
