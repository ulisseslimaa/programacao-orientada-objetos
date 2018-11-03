package Lista64Exercicios;

/******************************************************************************************************************
* 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja *
* realizar:                                                                                                       *
* 1 – Verificar se um dos números lidos é ou não múltiplo do outro                                                *
* 2 – Verificar se os dois números lidos são pares                                                                *
* 3 – Verificar se a média dos dois números é maior ou igual a 7.                                                 *
* 4 – Sair                                                                                                        *
*******************************************************************************************************************/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double Resultado;
		boolean menu = true;

		System.out.print("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		double n2 = entrada.nextDouble();

		while (menu) {
			System.out.print(
					"\nVocê deseja verificar se...\n1 - um dos números lidos é ou não múltiplo do outro\n2 - os dois números lidos são pares\n3 - a média dos dois números é maior ou igual a 7\n4 - Sair\nOpção Escolhida: ");
			int op = entrada.nextInt();
			switch (op) {
			case 1:
				if (n1 % n2 == 0 || n2 % n1 == 0) {
					System.out.println("Sim, um dos números é múltiplo do outro");
				} else {
					System.out.println("Não, nenhum dos números é múltiplos do outro");
				}
				break;
			case 2:
				if (n1 % 2 == 0 && n2 % 2 == 0) {
					System.out.println("Sim, os dois números lidos são pares.");
				} else {
					System.out.println("Não, os dois números lidos são ímpares.");
				}
				break;
			case 3:
				if ((n1 + n2) / 2 >= 7) {
					System.out.println("Sim, a média dos dois números é maior ou igual a 7.");
				} else {
					System.out.println("Não, a média dos dois números não é maior ou igual a 7.");
				}
				break;
			case 4:
				menu = false;
				System.out.print("Saindo...\n");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}