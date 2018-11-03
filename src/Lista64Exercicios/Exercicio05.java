package Lista64Exercicios;

/************************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz      *
* 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.        *
* 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.               *
* 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a          *
* 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,                 *
* 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais. *
*************************************************************************************************************************/

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double velocidadeMedia, tempoGasto;
		double distancia, litrosUsados;

		System.out.println("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n");

		System.out.print("Por favor, digita o tempo que você gastou em sua viagem (horas): ");
		tempoGasto = entrada.nextDouble();

		System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
		velocidadeMedia = entrada.nextDouble();

		distancia = tempoGasto * velocidadeMedia;
		litrosUsados = distancia / 12;

		System.out.println("\nResultados:\n");
		System.out.println("Velocidade média = " + velocidadeMedia + " Km/h");
		System.out.println("Tempo gasto = " + tempoGasto + " horas");
		System.out.println("Distancia Percorrida = " + distancia + " Km");
		System.out.println("Quantidade de Combustível utilizado: " + litrosUsados + " litros");
	}
}