package funcionario;

/**
 * @author ulisses
 *
 */
public class Funcionario {
	protected String nome;
	protected String cpf;
	String matricula;
	double salario;

	public Funcionario(String nome, String cpf, String matricula, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public void mostrar() {
		System.out.println("Nome.................: " + nome);
		System.out.println("CPF..................: " + cpf);
		System.out.println("Matricula............: " + matricula);
		System.out.println("Salario..............: " + salario);
	}
}
