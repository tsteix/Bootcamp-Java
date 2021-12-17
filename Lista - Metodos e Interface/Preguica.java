package br.com.generation.met;

public class Preguica extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("A preguiça está abraçando a árvore.");
		
	}
	
	@Override
	public void som() {
		System.out.println("A preguiça está ZZZZZZZZZ...");
		
	}

}