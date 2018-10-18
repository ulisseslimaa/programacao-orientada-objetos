package atividade1;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */

/** Escreva um programa em Java que leia dois números inteiros e determine qual é o menor.
 * 	Escreva um algoritmo que determine o maior também**/

public class Questao2 {	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero.....: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite outro numero..: ");
		int n2 = entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println("O número " +n1+ " eh Maior");
			System.out.println("O número " +n2+ " eh Menor");
		} else if (n1 < n2){ 
			System.out.println("O número " +n1+ " eh Menor");
			System.out.println("O número " +n2+ " eh Maior");
		} else {
			System.out.println("Os números digitados são iguais");
		}
	}
}


