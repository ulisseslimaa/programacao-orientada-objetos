package atividade1;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */

/** Receba uma idade e Verifique se o usuario é maior de idade ou não **/

public class Questao1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		if (idade >= 18) {
			System.out.println("Você é Maior de Idade");
		} else {
			System.out.println("Você NÃO é maior de idade");
		}
	}
}