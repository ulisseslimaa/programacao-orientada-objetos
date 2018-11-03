package Lista64Exercicios;

/***************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os *
* valores em ordem decrescente.                                            *
****************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] Numeros = new int[3];

		System.out.println("Ordenador de números\n");

		for (int i = 0; i < Numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + " número:  ");
			Numeros[i] = entrada.nextInt();
		}
		Arrays.sort(Numeros); // Ordenando o Array
		System.out.print("\nOs números em ordem crescente são: ");
		for (int i : Numeros) {
			System.out.print(i+" ");
		}
	}
}