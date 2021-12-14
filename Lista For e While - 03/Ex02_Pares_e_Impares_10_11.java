package br.com.generation.funcoessystemout;

import java.util.Scanner;

public class Ex02_Pares_e_Impares_10_11 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)\
	
	public static void main(String[] args) {
		
		int impar = 0, par = 0;
		int numero;
				
			Scanner entrada = new Scanner(System.in);
			
			for (int i = 1; i <= 10; i++) {
				System.out.println("Digite dez valores: ");
				numero = entrada.nextInt();
				if(numero %2 == 0) {
					par++;
				}
				if(numero %2 == 1) {
					impar++;
				}
			}
		System.out.println("Temos " + par + " Numeros Pares !!");
		System.out.println("\n E " + impar + " Numeros Impares! ");
		entrada.close();
	}

}
