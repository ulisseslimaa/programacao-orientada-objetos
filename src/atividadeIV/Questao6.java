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
		int n1 = 1, n2 = 0;
		System.out.println(n2);
		System.out.println(n1);
		for (int i = 0; i < 50; i++) {
			n1 = n1 + n2;
			n2 = n1 - n2;
			System.out.println(n1);
		}
		System.out.println("---------------------------------------");
		//outra forma de fazer
		int a = 1;
		int b = 0;
		int aux;
		for (int i = 0; i < 50; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
	}
}
