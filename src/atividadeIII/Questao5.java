package atividadeIII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao5 {
	/**
	 * Continua... Modifique o programa anterior permitindo ao usuário digitar a
	 * quantidade de números a serem somados. Por exemplo: o somátorio dos 50
	 * primeiros números inteiros e pares etc...
	 */
	public static void main(String[] args) {
		int c = 0;
		System.out.print("Digite o número desejado: ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				c += i;
			}
		}
		System.out.println("\nSomátorio dos " + num + " primeiros números pares: " + c);
	}
}
