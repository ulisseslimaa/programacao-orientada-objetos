package Lista64Exercicios;

/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os    *
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis *
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.         *
********************************************************************************/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		boolean igual = false, naoIgual = false, maior = false, menor = false, maiorOuIgual = false,
				menorOuIgual = false;

		System.out.println("Mostrador de relacionamentos\n"); 

		System.out.print("Digite o primeiro número..: ");
		n1 = entrada.nextInt();

		System.out.print("Digite o segundo número...: ");
		n2 = entrada.nextInt();

		if (n1 == n2)
			igual = true;
		if (n1 != n2)
			naoIgual = true;
		if (n1 > n2)
			maior = true;
		if (n1 < n2)
			menor = true;
		if (n1 >= n2)
			maiorOuIgual = true;
		if (n1 <= n2)
			menorOuIgual = true;

		System.out.println("\nIgual = " + igual);
		System.out.println("Não Igual = " + naoIgual);
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Maior ou igual = " + maiorOuIgual);
		System.out.println("Menor ou igual = " + menorOuIgual);

	}

}
