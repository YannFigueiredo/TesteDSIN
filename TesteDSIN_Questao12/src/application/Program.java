package application;

import entities.Pato;

public class Program {
	
	public static void main(String[] args) {
		Pato pato = new Pato("Donald", "Branco", 45);
		
		System.out.print("Nome: " + pato.getNome() + "\n");
		System.out.print("Cor: " + pato.getCor() + "\n");
		System.out.print("Idade: " + pato.getIdade());
	}
}
