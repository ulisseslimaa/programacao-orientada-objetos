package atividadeVI;

/**
 * @author ulisses
 *
 */
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario Lima = new Funcionario();
		Lima.setSalario(1000);
		Lima.bonifica(10);
		Lima.demite();
		Lima.mostrar();

	}
}
