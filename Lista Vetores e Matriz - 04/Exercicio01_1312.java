package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01_1312 {
	/*Faça um programa que crie um vetor por leitura 
	 *com 5 valores de pontuação de uma atividade e o escreva em seguida.
	 *Encontre após a maior pontuação e a apresente. 
	*/
	public static void main(String[] args) {
		
		int maiorNum = 0;
		int [] numeros = new int [5]; //new int inicialização do vetor.
		
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();
			if (numeros [i] > maiorNum) {
				maiorNum = numeros [i];
			}
			
		}
	
		System.out.println("O maior valor apresentado é: " + maiorNum);
		entrada.close();
	}
}
