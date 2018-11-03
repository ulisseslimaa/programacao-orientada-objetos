package Lista64Exercicios;

/****************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo. *
*   O módulo de um número x é:                                             *
*   x se x é maior ou igual a zero                                         * 
*   x * (-1) se x é menor que zero                                         *
****************************************************************************/

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, moduloNum;

		System.out.println("Módulo de Número\n");

		System.out.print("Digite um número inteiro: ");
		num = entrada.nextInt();

		moduloNum = (num < 0) ? moduloNum = num * (-1) : num; // usando operador condicional ternário

		System.out.println("O módulo do número é " + moduloNum);
	}
}