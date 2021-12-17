package br.com.generation.met;

public class Cavalo extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("O cavalo está trotando.");
	}

	@Override
	public void som() {
		System.out.println("O cavalo está fazendo POCOTO POCOTO POCOTO!\n");
	}
}