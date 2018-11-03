package atividadeII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao4 {
	/**
	 * Dadas as três notas de um aluno, exibir a média das notas e a situação do
	 * aluno: aprovado, de final ou reprovado. A média das notas é feita através da
	 * média aritmética das mesmas.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua 1ª Nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite sua 1ª Nota: ");
		double nota2 = entrada.nextDouble();
		System.out.print("Digite sua 1ª Nota: ");
		double nota3 = entrada.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7.0) {
			System.out.println("Você está Aprovado!");
		} else if (media <= 4.0) {
			System.out.println("Você está na Prova Final!");
		} else {
			System.out.println("Você está Reprovado!");
		}
	}
}