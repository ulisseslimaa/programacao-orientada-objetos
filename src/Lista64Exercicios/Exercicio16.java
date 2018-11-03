package Lista64Exercicios;

/******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o *
* valor do maior número e o valor do menor número. Se os dois números forem   *
* iguais, o programa deve exibir mensagem informando este fato.               *
*******************************************************************************/

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Verificador de números\n");

		System.out.print("Digite o primeiro número.: ");
		int n1 = entrada.nextInt();

		System.out.print("Digite o segundo número..: ");
		int n2 = entrada.nextInt();

		if (n1 > n2) {
			System.out.println("O número " + n1 + " é o Maior");
			System.out.println("O número " + n2 + " é o Menor");
		} else if (n1 < n2) {
			System.out.println("O número " + n1 + " é o Menor");
			System.out.println("O número " + n2 + " é o Maior");
		} else {
			System.out.println("Os dois números são iguais.");
		}
	}
}