package funcionario;

/**
 * @author ulisses
 *
 */
public class Administrativo extends Funcionario {
	int quantidadeHoras;

	public Administrativo(String nome, String cpf, String matricula, double salario, int quantidadeHoras) {
		super(nome, cpf, matricula, salario);
		this.quantidadeHoras = quantidadeHoras;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Quantidade de Horas..: " + quantidadeHoras + "\n");
	}
}
