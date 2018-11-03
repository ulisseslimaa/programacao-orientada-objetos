package atividadeII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao3 {
	/**
	 * Fazer uma calculadora simples onde o usuário digita dois números em uma
	 * operação (+,-,*,/). O programa deve exibir o resultado da operação final.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número 1: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o número 2: ");
		double n2 = entrada.nextDouble();

		System.out.print("Escolha uma das opções: " + "\n 01: Somar \n 02: Subtrair \n 03: Multiplicar  "
				+ "\n 04: Dividir: \n Opção escolhida: ");
		int op = entrada.nextInt();
		double resultado = 0;
		switch (op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			resultado = n1 / n2;
			break;
		}
		System.out.println("Resultado igual a: " + resultado);
	}
}
