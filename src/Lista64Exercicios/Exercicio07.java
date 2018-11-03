package Lista64Exercicios;

/************************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão de      *
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a *
* 		variável C é a temperatura em graus Celsius.                                                                    *
*************************************************************************************************************************/

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double c, f;
		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n");

		System.out.print("Digite a temperatura em Fahrenheit: ");
		f = entrada.nextDouble();

		c = (f - 32) * 5 / 9;

		System.out.println("\nA medida convertida é " + c + "ºC");
	}
}