package Lista64Exercicios;

/*******************************************************************************
* 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for *
* negativo, em B. No final mostrar o resultado.                                *
********************************************************************************/

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a = 0, b = 0, num;
		System.out.print("Organizador de números\n\n"); // O texto do exercício é muito vago, mas acho que é isso o que
														// ele quis dizer:
		do {
			System.out.print("Digite um número, digite 0 para sair: ");
			num = entrada.nextDouble();
			if (num > 0) {
				a += num;
				System.out.print("Numero armazenado em A\n");
			} else if (num < 0) {
				b += num;
				System.out.print("Numero armazenado em B\n");
			}
		} while (num != 0);
		System.out.printf("A = %.2f\nB = %.2f", a, b);
	}
}