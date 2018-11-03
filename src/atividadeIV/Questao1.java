package atividadeIV;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */

public class Questao1 {
	/**
	 * Faça um programa em java para ler 30 números reais e exibir a média
	 * aritmética.
	 */
	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; i <= 30; i++) {
			System.out.print("Digite um Número real: ");
			double num = new Scanner(System.in).nextDouble();
			c += num;
		}
		System.out.println("\nMédia Aritmética: " + c / 30);
	}

}
