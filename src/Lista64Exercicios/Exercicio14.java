package Lista64Exercicios;

/***************************************************************************
* 14) Escreva um programa que leia dois números e apresente a diferença do *
* maior para o menor.                                                      *
****************************************************************************/

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2, diferenca;

		System.out.println("Verificador de números\n");

		System.out.print("Digite o primeiro número.: ");
		n1 = entrada.nextInt();

		System.out.print("Digite o segundo número..: ");
		n2 = entrada.nextInt();

		if (n1 >= n2) {
			diferenca = n1 - n2;
		} else {
			diferenca = n2 - n1;
		}
		System.out.print("\nA diferença do maior para o menor é " + diferenca);
	}
}