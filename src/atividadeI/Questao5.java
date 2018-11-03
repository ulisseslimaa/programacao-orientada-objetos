package atividadeI;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao5 {
	/**
	 * Receba um numero na faixa de 1 a 12 e diga o mês correspondente. Exemplo: 1 =
	 * Janeiro, 2 = Fevereiro ...............
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número na faixa de 1 a 12");
		int num = entrada.nextInt();

		switch (num) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("ERRO!!! Digite um número entre 1 e 12");
			break;
		}
	}
}
