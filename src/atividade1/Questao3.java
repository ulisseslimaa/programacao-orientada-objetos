package atividade1;

import java.util.Scanner;

public class Questao3 {

/** Escreva um programa em Java que recebe um inteiro e diga se ele é par ou ímpar**/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = entrada.nextInt();
		if (n % 2 == 0) {
			System.out.println("O Número que você digitou é PAR!");
		} else {
			System.out.println("O Número que você digitou é IMPAR!");
		}
	}
}
