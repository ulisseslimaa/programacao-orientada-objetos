package Lista64Exercicios;

/*******************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão de *
* 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus   *
* 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.                                         *
********************************************************************************************************************/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double c, f;

		System.out.println("Conversor de temperatura: Graus Celsios -> Fahrenheit\n");

		System.out.print("Digite a temperatura em Celsius: ");
		c = entrada.nextDouble();

		f = (9 * c + 160) / 5;
		System.out.println("\nA medida convertida é " + f + "ºF");
	}
}