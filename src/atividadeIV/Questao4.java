package atividadeIV;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao4 {
	/**
	 * Escreva um programa que dado uma entrada do usuário, exemplo: 10, mostre seus
	 * divisores.
	 */
	public static void main(String[] args) {
		System.out.println("Verificador de números\n");
		System.out.print("Digite um número: ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("\nOs divisores de " + num + " são: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
