package Lista64Exercicios;

/***************************************************************************************************
* 19) Escreva um programa que leia três valores para os lados de um triângulo                      *
* (variáveis A, B e C). Verificar se cada lado é menor que a soma dos outros dois lados. Se sim,   *
* saber de A == B e se B == C, sendo verdade o triângulo é equilátero; Se não, verificar de A == B *
* ou se A == C ou se B == C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo  * 
* será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.    *
****************************************************************************************************/

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Verificador de Triângulo\n");

		System.out.print("Digite o lado A = ");
		int a = entrada.nextInt();

		System.out.print("Digite o lado B = ");
		int b = entrada.nextInt();

		System.out.print("Digite o lado C = ");
		int c = entrada.nextInt();

		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.print("O triângulo é Equilátero.");
			} else if (a == b || a == c || b == c) {
				System.out.print("O triângulo é Isósceles.");
			} else {
				System.out.print("O triângulo é Escaleno.");
			}
		} else {
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}
	}
}