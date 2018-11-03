package Lista64Exercicios;

/******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos  *
* valores de modo que a variável A passe a possuir o valor da variável B, e a *
* variável B passe a possuir o valor da variável A. Apresentar os valores     *
* trocados.                                                                   *
*******************************************************************************/

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, aux;
		System.out.println("Efetuador de troca de valores entre variaveis\n");
		
		System.out.print("Digite a variável A: ");
		a = entrada.nextInt();

		System.out.print("Digite a variável B: ");
		b = entrada.nextInt();
		aux = a;
		a = b;
		b = aux;
		System.out.print("A = " + a + " | B = " + b);
	}
}