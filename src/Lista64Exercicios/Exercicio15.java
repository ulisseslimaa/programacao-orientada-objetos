package Lista64Exercicios;

/********************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e         *
* apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar  *
* for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota *
* do recuperação, somar com o valor da média e obter a nova média. Se a nova    *
* média for maior ou igual a 7, apresentar uma mensagem informando que o aluno  *
* foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma      *
* mensagem informando esta condição. Apresentar junto com as mensagens o valor  *
* da média do aluno.                                                            *
*********************************************************************************/

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean aprovado = false;

		System.out.println("Verificador de notas\n");

		System.out.print("Digite a primeira nota..: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota...: ");
		double nota2 = entrada.nextDouble();

		System.out.print("Digite a terceira nota..: ");
		double nota3 = entrada.nextDouble();

		System.out.print("Digite a quarta nota....: ");
		double nota4 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			aprovado = true;
		} else {
			System.out.print("O aluno ficou de recuperação, digite a nota: ");
			double notaRecuperacao = entrada.nextDouble();
			media = (media + notaRecuperacao) / 2;
			if (media >= 7) {
				aprovado = true;
			}
		}
		if (aprovado == true) {
			System.out.printf("\nO Aluno foi aprovado com a média %.2f", media); // formatando a saída da media para
																				 // pegar dois primeiros numeros apos
																				 // a virgula.
		} else {
			System.out.printf("\nO Aluno foi reprovado com a média %.2f", media);
		}
	}
}