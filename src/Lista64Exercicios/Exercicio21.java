package Lista64Exercicios;

/********************************************************************************
* 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela *
* indicando se este número é positivo ou negativo. Pare a execução do programa  *
* quando o usuário requisitar.                                                  *
*********************************************************************************/

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Verificador de numeros positivos ou negativos\n");

		do {
			System.out.print("Digite um número, digite 0 para sair: ");
			num = entrada.nextInt();
			if (num > 0) {
				System.out.println("O número é Positivo\n");
			} else {
				System.out.println("O número é Negativo\n");
			}
		} while (num != 0);
	}
}