package Lista64Exercicios;

/*********************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:      *
* 		V = 3.14159 * R * R * A                                                              *  
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. *
**********************************************************************************************/

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio, altura, volume;

		System.out.println("Cálculo de volume de lata de óleo\n");

		System.out.print("Digite diâmeto da lata (em cm): ");
		raio = entrada.nextDouble() / 2;

		System.out.print("Digite a altura da lata (em cm): ");
		altura = entrada.nextDouble();

		volume = Math.PI * raio * raio * altura;

		System.out.print("\nO volume da lata é de " + volume + " cm³");
	}
}