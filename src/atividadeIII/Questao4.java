package atividadeIII;

/**
 * @author ulisses
 *
 */
public class Questao4 {
	/**
	 * Faça um programa que realiza a soma (Somatório) dos 100 primeiros números
	 * naturais, imprimindo o seu resultado.
	 */
	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; i <= 100; i++) {
			c += i;
		}
		System.out.println("Somatório dos 100 primeiros números naturais: " + c);
	}
}
