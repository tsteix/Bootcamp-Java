package br.com.generation.met;

public class Cavalo extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("O cavalo est� trotando.");
	}

	@Override
	public void som() {
		System.out.println("O cavalo est� fazendo POCOTO POCOTO POCOTO!\n");
	}
}