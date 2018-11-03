package Lista64Exercicios;

/**************************************
 *  2) Faça um programa que:          * 
 *    - Leia a cotação do dólar       *
 *    - Leia um valor em dólares      *
 *    - Converta esse valor para Real *
 *    - Mostre o resultado            *
 **************************************/

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotacaoDolar, valorDolar, valorReal;

		System.out.println("Conversor de dólar em real\n");

		System.out.print("Digite a cotação do dolar: ");
		cotacaoDolar = entrada.nextDouble();

		System.out.print("Digite o valor em dolar: ");
		valorDolar = entrada.nextDouble();

		valorReal = cotacaoDolar * valorDolar;

		System.out.print("O Valor em reais é " + valorReal);
	}
}
