/**
 * 
 */
package atividadeIII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao2 {
	/**
	 * Continua... Modifique o Algoritmo anterior e permita ao usuário escolher a a
	 * quantidade de números pares a ser impresso. Por exemplo: os 50 primeiros
	 * pares ou 1000 primeiros números pares etc...
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de números pares a serem impressos: ");
		int n = entrada.nextInt();
		for (int i = 0; i < n; i += 2) {
			System.out.println(i);
		}
	}
}
