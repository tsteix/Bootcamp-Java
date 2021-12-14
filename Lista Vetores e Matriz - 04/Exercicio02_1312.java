package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02_1312 {
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado.
	 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	 * A seguir determine e imprima a média aritmética dos lançamentos,
	 *  contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	 */
	public static void main(String [] args) {
		int cont = 0;
		int repeticao = 0 , soma = 0, media = 0, maiorNum = 0;
		int [] lancamento = new int [10];
		
		System.out.println("===== PRO DADOS v0.2 ===== ");
		
		Scanner entrada = new Scanner (System.in);
		for (int i = 0; i < lancamento.length; i++) {
			System.out.println("= Digite o resultado do lançamento: ");
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
		System.out.println("O numero de repetições do maior valor é: " + cont);
		System.out.println("A Média de valores lancados é: " + media);
		
		entrada.close();
	}

}
