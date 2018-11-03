package atividadeIV;

/**
 * @author ulisses
 *
 */
public class Questao3 {
	/**
	 * Faça um programa que informe quais números inteiros divisíveis por 11 são
	 * resto igual a 5, no intervalo de 1000 a 1999.
	 */
	public static void main(String[] args) {
		System.out.println("Números inteiros divisíveis por 11 com resto igual a 5 no intervalo de 1000 e 1999");
		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
