package Lista64Exercicios;

/******************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que: *
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.              *
 ******************************************************************************/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double quantidadeMinima, quantidadeMaxima, estoqueMedio;

		System.out.println("=====Calculadora de Estoque Médio=====\n");

		System.out.print("Digite a quantidade mímima: ");
		quantidadeMinima = entrada.nextDouble();

		System.out.print("Digite a quantidade máxima: ");
		quantidadeMaxima = entrada.nextDouble();

		estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

		System.out.print("Estoque Médio = " + estoqueMedio + "\n");
	}
}
