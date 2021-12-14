package br.com.generation.funcoessystemout;

public class Ex01_10_12  {

	public static void main(String[] args) {
				
		
		for(int num = 1000; num < 2000; num++ ) {
			if(num % 11 == 5) {
				System.out.print("\n" + num  + " tem resto " + (num % 11));
					
			}
		}

	}

}