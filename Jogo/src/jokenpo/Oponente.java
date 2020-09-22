package jokenpo;

import java.util.Random;

public class Oponente {
	
	private int sistema;
	private String conversao;	

	public void escolhaOponente() {
	Random cpu = new Random();	
	for (int i = 0; i < 2; i++) {
		this.setSistema(cpu.nextInt(3));		
	}
	if (getSistema() == 0) {
		setConversao("Pedra");
	}else if (getSistema() == 1) {
		setConversao("Papel");
	}else {
		setConversao("Tesoura");
	}
	System.out.print("Seu oponente escolheu: " + getConversao());
}
	
	public int getSistema() {
		return sistema;
	}

	public void setSistema(int sistema) {		
		this.sistema = sistema;
	}
	
	public String getConversao() {
		return this.conversao;
	}

	public void setConversao(String conversao) {
		this.conversao = conversao;
	}
}
