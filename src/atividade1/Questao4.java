package atividade1;

import java.util.Scanner;

public class Questao4 {
	
	/** Crie um programa que recebe uma nota (pela classe Scanner)  e checa se você passou direto, ficou de recuperação
	 *  ou foi reprovado na matéria.
	 *  A regra é a seguinte:
	 *  Nota 7 ou mais: passou direto
	 *  Entre 5 e 7: tem direito de fazer uma prova de recuperação
	 *  Abaixo de 5: reprovado direto. **/
		 
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite sua nota..: ");
			double nota = entrada.nextDouble();
			if (nota >= 7.0) {
				System.out.println("Passou direto");
			} else if (nota >= 5.0 && nota < 7.0) {
				System.out.println("Tem direito de fazer uma prova de recuperação");
			} else {
				System.out.println("Reprovado direto");
			}
		}
}
