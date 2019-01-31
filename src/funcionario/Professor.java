package funcionario;

/**
 * @author ulisses
 *
 */
public class Professor extends Funcionario {
	String regime;

	public Professor(String nome, String cpf, String matricula, double salario, String regime) {
		super(nome, cpf, matricula, salario);
		this.regime = regime;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Regime...............: " + regime + "\n");
	}
}
