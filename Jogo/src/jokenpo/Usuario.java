package jokenpo;

import java.util.Scanner;

public class Usuario {

	private String nome;
	private String pedra;
	private String papel;
	private String tesoura;

	public void insereNome() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		setNome(scanner.nextLine());
	}

	public void limpaNome() {
		setNome(null);
	}

	public void escolhaPedra() {
		setPedra("Pedra");
		System.out.println("Voce jogou: " + getPedra());
	}

	public void escolhaPapel() {
		setPapel("Papel");
		System.out.println("Voce jogou: " + getPapel());
	}

	public void escolhaTesoura() {
		setTesoura("Tesoura");
		System.out.println("Voce jogou: " + getTesoura());
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPedra() {
		return this.pedra;
	}

	public void setPedra(String pedra) {
		this.pedra = pedra;
	}

	public String getPapel() {
		return this.papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public String getTesoura() {
		return this.tesoura;
	}

	public void setTesoura(String tesoura) {
		this.tesoura = tesoura;
	}

}
