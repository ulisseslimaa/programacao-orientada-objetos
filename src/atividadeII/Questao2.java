package atividadeII;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */
public class Questao2 {
	/**
	 * A prefeitura permite empréstimos a seus funcionários onde o valor máximo da
	 * prestação não ultrapasse 30% do salário. Dados os valores do salário, do
	 * empréstimo e quantidade de prestações; informar se o empréstimo é permitido
	 * ou não. Não considere acréscimo de juros.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vSalario;
		double vEmprestimo;
		int qtdPrestacoes;
		System.out.print("Digite o Valor do seu Salário.........: ");
		vSalario = entrada.nextDouble();
		System.out.print("Digite o Valor do Empréstimo..........: ");
		vEmprestimo = entrada.nextDouble();
		System.out.print("Informe a quantidade de prestações....: ");
		qtdPrestacoes = entrada.nextInt();
		double vPrestacao = (vEmprestimo / qtdPrestacoes);
		if (vPrestacao > (vSalario * 0.30)) {
			System.out.println("========Empréstimo Não Permitido========");
		} else {
			System.out.println("==========Empréstimo Permitido==========");
		}
	}
}
