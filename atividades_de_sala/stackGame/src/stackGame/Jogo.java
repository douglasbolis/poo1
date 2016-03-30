package stackGame;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Pilha p = new Pilha();
		int numJog1 = 0, numJog2 = 0, ptsJog1 = 0, ptsJog2 = 0;
		
		p.crie();
		
		// Jogador1 joga e o jogador2 responde		
		System.out.println("~ Vez do jogador 1 ~\n");
		System.out.println("Digite uma sequencia de " + p.getMaxPilha() + " com numeros entre " + p.getMinNum() + " e " + p.getMaxNum());
		
		for(int i = 0; i < p.getMaxPilha(); i++) {
			System.out.print("Digite o " + (i+1) + "º da sequencia: ");
			numJog1 = reader.nextInt();
			
			while((numJog1 < p.getMinNum()) || (numJog1 > p.getMaxNum())) {
				System.out.print(" Numero fora do intervalo");
				System.out.print(" Digite o " + (i+1) + "º da sequencia: ");
				numJog1 = reader.nextInt();
			}
			p.empilhe(numJog1);
		}
		
		System.out.println("~ Vez do jogador 2 ~\n");
		System.out.print("Digite um numero entre " + p.getMinNum() + " e " + p.getMaxNum() + ": ");
		numJog2 = reader.nextInt();
		
		while((numJog2 < p.getMinNum()) || (numJog2 > p.getMaxNum())) {
			System.out.print(" Numero fora do intervalo");
			System.out.print(" Digite um numero entre " + p.getMinNum() + " e " + p.getMaxNum() + ": ");
			numJog2 = reader.nextInt();
		}
		
		ptsJog2 = p.calculaPontuacao(numJog2);
		
		
		// Jogador2 joga e o jogador1 responde
		System.out.println("~ Vez do jogador 2 ~\n");
		System.out.println("Digite uma sequencia de " + p.getMaxPilha() + " com numeros entre " + p.getMinNum() + " e " + p.getMaxNum());
		
		for(int i = 0; i < p.getMaxPilha(); i++) {
			System.out.print("Digite o " + (i+1) + "º da sequencia: ");
			numJog2 = reader.nextInt();
			
			while((numJog2 < p.getMinNum()) || (numJog2 > p.getMaxNum())) {
				System.out.print(" Numero fora do intervalo");
				System.out.print(" Digite o " + (i+1) + "º da sequencia: ");
				numJog2 = reader.nextInt();
			}
			p.empilhe(numJog2);
		}

		System.out.println("~ Vez do jogador 1 ~\n");
		System.out.print("Digite um numero entre " + p.getMinNum() + " e " + p.getMaxNum() + ": ");
		numJog1 = reader.nextInt();
		
		while((numJog1 < p.getMinNum()) || (numJog1 > p.getMaxNum())) {
			System.out.print(" Numero fora do intervalo");
			System.out.print(" Digite um numero entre " + p.getMinNum() + " e " + p.getMaxNum() + ": ");
			numJog1 = reader.nextInt();
		}
		
		ptsJog1 = p.calculaPontuacao(numJog1);
		
		System.out.print("Pontuacoes:\n Jogador1: " + ptsJog1 + "\n Jogador2: " + ptsJog2);
		
		reader.close();
	}
}