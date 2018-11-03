package atividadeIII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao6 {
	/**
	 * Continua... Modifique o programa anterior para realizar a multiplicação.
	 */
	public static void main(String[] args) {
		int c = 1;
		System.out.print("Digite o número desejado: ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				c *= i;
			}
		}
		System.out.println("\nProdutório dos " + num + " primeiros números pares: " + c);
	}
}
