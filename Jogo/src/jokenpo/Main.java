package jokenpo;

public class Main {

	public static void main(String[] args) {
		
		Usuario jogador1 = new Usuario();
		Oponente jogador2 = new Oponente();
		Resultado jogada = new Resultado();
		jogador1.insereNome();
		jogador1.escolhaTesoura();
		jogador2.nomeOponente();
		jogador2.escolhaOponente();
		jogada.Resultado();
	}

}
