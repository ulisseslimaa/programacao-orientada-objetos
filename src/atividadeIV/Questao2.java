package atividadeIV;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao2 {
	/**
	 * Continue... Modifique o programa anterior para permitir ao usuário digitar os
	 * números e ao colocar uma consição de parada.
	 */
	public static void main(String[] args) {
		double c = 0;
		int i = 0;
		System.out.println("Condição de parada: -1\n");
		while (true) {
			System.out.print("Digite um número real: ");
			double num = new Scanner(System.in).nextDouble();
			c += num;
			i++;
			if (num == -1) {
				break;
			}
		}
		System.out.print("Média Aritmética: " + c / i);
	}
}
