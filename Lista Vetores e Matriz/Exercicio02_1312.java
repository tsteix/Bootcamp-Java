package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02_1312 {
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
	 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
	 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
	 *  contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
	 */
	public static void main(String [] args) {
		int cont = 0;
		int repeticao = 0 , soma = 0, media = 0, maiorNum = 0;
		int [] lancamento = new int [10];
		
		System.out.println("===== PRO DADOS v0.2 ===== ");
		
		Scanner entrada = new Scanner (System.in);
		for (int i = 0; i < lancamento.length; i++) {
			System.out.println("= Digite o resultado do lan�amento: ");
			lancamento[i] = entrada.nextInt();
			soma = soma + lancamento[i];
			if (lancamento[i] > maiorNum) {
				maiorNum = lancamento[i];
			}
			
		}
		media = soma / 10;
		
		for (int i = 0; i < lancamento.length; i++) {
			if(lancamento[i] == maiorNum ) {
				cont++;
			}
			
		}
		System.out.println("O numero de repeti��es do maior valor �: " + cont);
		System.out.println("A M�dia de valores lancados �: " + media);
		
		entrada.close();
	}

}
