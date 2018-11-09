package atividadeIV;

/**
 * @author ulisses
 *
 */
public class Questao6 {
	/**
	 * Mostre na tela os 50 primeiros números da série de Fibonacci
	 */
	public static void main(String[] args) {
		
		System.out.println("Esses são os 50 primeiros números da sequência de Fibonacci!");
		System.out.println("---------------------------------------");
		// outra forma de fazer
		long a = 1;
		long b = 0;
		long aux;
		for (int i = 0; i < 50; i++) {
			System.out.print(b + " ");
			aux = a;
			a = a + b;
			b = aux;
		}
		System.out.println("Esses são os 50 primeiros números da sequência de Fibonacci!");
		System.out.println("---------------------------------------");
	}
}
