package Lista64Exercicios;

/*****************************************************************************************
* 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada *
* uma delas:                                                                             *
*		1 - Adição                                                                       *
*		2 - Subtração                                                                    *
*		3 - Multiplicação                                                                *
*		4 - Divisão                                                                      *
******************************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calculadora\n");
		System.out.print("Digite uma das operações a seguir:"
				+ "\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n Opção Escolhida: ");
		int op = entrada.nextInt();

		System.out.print("Digite o primeiro número.: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo número..: ");
		double n2 = entrada.nextDouble();

		double resultado;
		switch (op) {
		case 1:
			resultado = n1 + n2;
			System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.printf("%.2f - %.2f = %.2f", n1, n2, resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.printf("%.2f * %.2f = %.2f", n1, n2, resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, resultado);
			break;
		default:
			System.out.print("Opção inválida!");
		}
	}
}