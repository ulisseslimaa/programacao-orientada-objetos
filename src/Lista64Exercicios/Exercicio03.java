package Lista64Exercicios;

/*********************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,        *
 *		levando-se em consideração que sua comissão será de 5% do total da venda *
 *		e que você tem os seguintes dados:                                       *
 * 		- Identificação do vendedor                                              *
 * 		- Código da peça                                                         *
 * 		- Preço unitário da peça                                                 *
 * 		- Quantidade vendida                                                     * 
 *********************************************************************************/

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa para pagamento de comissão de vendedores de peças.\n");

		int idVendedor, idPeca;
		double precoPeca, quantidade, valorComissao;
		System.out.print("Digite a identificação do vendedor: ");
		idVendedor = entrada.nextInt();

		System.out.print("Digite o ID da Peça: ");
		idPeca = entrada.nextInt();

		System.out.print("Digite o preço unitário da peça: ");
		precoPeca = entrada.nextDouble();

		System.out.print("Digite a quantidade de peças vendidas: ");
		quantidade = entrada.nextDouble();

		valorComissao = (precoPeca * quantidade) * 0.05;
		System.out.printf("O valor da comissão é de R$ %.2f.", valorComissao);
	}
}
