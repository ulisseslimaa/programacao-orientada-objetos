package atividadeIII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao3 {
	/**
	 * Os números divisíveis por ele mesmo e 1, são considerados números primos.
	 * Faça um programa que imprima uma sequência de primos, porém a quantidade é
	 * escolhida pelo usuário.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int num = new Scanner(System.in).nextInt();
		System.out.print("Digite a quantidade de primos desejada: ");
		for (int i = 0; i < num + 1; i++) {
			if (num % 1 == 0) {
				cont += 1;
			}
			if (cont == 2) {
				System.out.println("É Primo!");
			} else {
				System.out.println("Não é Primo!");
			}
		}
		entrada.close();

//        System.out.println("Lista de números primos: "+Primos);

	}

}
