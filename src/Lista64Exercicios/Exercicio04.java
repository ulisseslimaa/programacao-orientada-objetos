package Lista64Exercicios;
/************************************************************************************************************************
 * 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os     *
 * 	valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis *
 * 	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B          *
 * 	com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,             *
 * 	devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as                     *
 * 	multiplicações.                                                                                                     *
 ************************************************************************************************************************/

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[4];

		System.out.println("Exercício 4, leia o enunciado.\n");

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			valores[i] = entrada.nextInt();
		}
		System.out.println("\nResultados:\n");

		System.out.println("Valor 1 e Valor 2:");
		System.out.println("	" + valores[0] + " + " + valores[1] + " = " + (valores[0] + valores[1]));
		System.out.println("	" + valores[0] + " * " + valores[1] + " = " + (valores[0] * valores[1]) + "\n");

		System.out.println("Valor 1 e Valor 3:");
		System.out.println("	" + valores[0] + " + " + valores[2] + " = " + (valores[0] + valores[2]));
		System.out.println("	" + valores[0] + " * " + valores[2] + " = " + (valores[0] * valores[2]) + "\n");

		System.out.println("Valor 1 e Valor 4:");
		System.out.println("	" + valores[0] + " + " + valores[3] + " = " + (valores[0] + valores[3]));
		System.out.println("	" + valores[0] + " * " + valores[3] + " = " + (valores[0] * valores[3]) + "\n");

		System.out.println("Valor 2 e Valor 3:");
		System.out.println("	" + valores[1] + " + " + valores[2] + " = " + (valores[1] + valores[2]));
		System.out.println("	" + valores[1] + " * " + valores[2] + " = " + (valores[1] * valores[2]) + "\n");

		System.out.println("Valor 2 e Valor 4:");
		System.out.println("	" + valores[1] + " + " + valores[3] + " = " + (valores[1] + valores[3]));
		System.out.println("	" + valores[1] + " * " + valores[3] + " = " + (valores[1] * valores[3]) + "\n");

		System.out.println("Valor 3 e Valor 4:");
		System.out.println("	" + valores[2] + " + " + valores[3] + " = " + (valores[2] + valores[3]));
		System.out.println("	" + valores[2] + " * " + valores[3] + " = " + (valores[2] * valores[3]) + "\n");
	}
}