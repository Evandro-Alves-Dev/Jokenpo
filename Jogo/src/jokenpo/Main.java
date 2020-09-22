package jokenpo;

public class Main {

	public static void main(String[] args) {
		
		Usuario jogador1 = new Usuario();
		Oponente jogador2 = new Oponente();
		jogador1.insereNome();
		jogador1.escolhaPapel();
		jogador2.nomeOponente();
		jogador2.escolhaOponente();
		
	}

}
