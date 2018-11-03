package Lista64Exercicios;
/****************************************************************************************************
* 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor       *
* maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler       *
* novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor. *
*****************************************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[3];

		System.out.println("Verificador de variáveis\n");

		for (int x = 0; x < 3; x++) {
			System.out.print("Digite o valor " + (x + 1) + ": ");
			valores[x] = entrada.nextInt();
			if (valores[x] <= 0) {
				System.out.print("Digite um valor válido no valor: ");
				valores[x] = entrada.nextInt();
			}
		}
		Arrays.sort(valores);
		System.out.print("Exibe o menor valor lido multiplicado pelo maior: " + (valores[0] * valores[2])
				+ "  E o maior valor dividido pelo menor: " + (valores[2] / valores[0]));
	}
}