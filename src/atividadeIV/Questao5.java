package atividadeIV;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao5 {
	/**
	 * Mostre na tela os números múltiplos de 5, entre 1 e 100
	 */
	public static void main(String[] args) {
		System.out.println("Os multiplpos de 5, entre 1 e 100 são:");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
