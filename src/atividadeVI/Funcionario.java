package atividadeVI;

/**
 * @author ulisses
 *
 */
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	boolean estadoNaEmpresa;

	void bonifica(double aumento) {
		double bonificacao;
		bonificacao = (this.salario * aumento/100);
		System.out.println("Novo Salário: " + (this.salario + bonificacao));
	}

	void demite() {
		estadoNaEmpresa = false;
	}
	void mostrar() {
		System.out.println(nome);
		System.out.println(departamento);
		System.out.println(salario);
		System.out.println(estadoNaEmpresa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isEstadoNaEmpresa() {
		return estadoNaEmpresa;
	}

	public void setEstadoNaEmpresa(boolean estadoNaEmpresa) {
		this.estadoNaEmpresa = estadoNaEmpresa;
	}
	
}
