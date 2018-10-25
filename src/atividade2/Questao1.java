package atividade2;

import java.util.Scanner;

/**
 * @author ulisses
 *
 */

public class Questao1 {

/** Faça um algoritmo de troca de variáveis: dados valores para duas variáveis A e B, o
 *  novo valor de A passa a ser o de B e o novo de B passa a ser o de A. */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aux; // variável auxiliar
		
		System.out.println("Digite um valor para A: ");
		int a = entrada.nextInt();
		
		System.out.println("Digite um valor para B: ");
		int b = entrada.nextInt();
		
		aux = a; //variável auxiliar para guardar o valor de a.
		a = b;   //a recebe valor de b.
		b = aux; //b recebe valor de aux .
		System.out.println("Novo Valor de A: " + a);
		System.out.println("Novo Valor de B: " + b);
	}
}
