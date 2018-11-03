package Lista64Exercicios;

/*********************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e  * 
* 	 dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano *
*    com 365 dias e mês com 30 dias.                                             *  
**********************************************************************************/

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, totalDias;
		System.out.println("Calculadora de idade em dias\n");

		System.out.print("Digite os anos..: ");
		anos = entrada.nextInt();

		System.out.print("Digite os meses.: ");
		meses = entrada.nextInt();

		System.out.print("Digite os dias..: ");
		dias = entrada.nextInt();

		totalDias = anos * 365 + meses * 30 + dias;

		System.out.println("Idade total em dias = " + totalDias);
	}
}
