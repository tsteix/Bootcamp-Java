package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01_1312 {
	/*Fa�a um programa que crie um vetor por leitura 
	 *com 5 valores de pontua��o de uma atividade e o escreva em seguida.
	 *Encontre ap�s a maior pontua��o e a apresente. 
	*/
	public static void main(String[] args) {
		
		int maiorNum = 0;
		int [] numeros = new int [5]; //new int inicializa��o do vetor.
		
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();
			if (numeros [i] > maiorNum) {
				maiorNum = numeros [i];
			}
			
		}
	
		System.out.println("O maior valor apresentado �: " + maiorNum);
		entrada.close();
	}
}
