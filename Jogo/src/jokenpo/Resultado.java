package jokenpo;

public class Resultado {	
	
	public void Resultado() {
		Usuario jogador1 = new Usuario();
		Oponente jogador2 = new Oponente();		
		if (jogador2.getSistemaConvertido() == "Pedra" && jogador1.getTesoura() == "Tesoura") {
			System.out.println(jogador2.getNomeConvertido() +" ganhou.");
		}else if (jogador2.getSistemaConvertido() == "Papel" && jogador1.getPedra() == "Pedra") {
			System.out.println(jogador2.getNomeConvertido() +" ganhou.");
		}else if (jogador2.getSistemaConvertido() == "Tesoura" && jogador1.getPapel() == "Papel") {
			System.out.println(jogador2.getNomeConvertido() +" ganhou.");
		}else if (jogador2.getSistemaConvertido() == "Pedra" && jogador1.getPapel() == "Papel") {
			System.out.println("PARABENS, VOCE GANHOU!!!");
		}else if (jogador2.getSistemaConvertido() == "Papel" && jogador1.getTesoura() == "Tesoura") {
			System.out.println("PARABENS, VOCE GANHOU!!!");
		}else if (jogador2.getSistemaConvertido() == "Tesoura" && jogador1.getPedra() == "Pedra") {
			System.out.println("PARABENS, VOCE GANHOU!!!");
		}else {
			System.out.println("Empate.");			
		}		
	}
}	

