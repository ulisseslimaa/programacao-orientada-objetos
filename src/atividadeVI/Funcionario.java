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
		bonificacao = this.salario * aumento / 100;
		this.salario = this.salario + bonificacao;
	}

	void demite() {
		this.estadoNaEmpresa = false;
	}

	void mostrar() {
		System.out.println("Nome...............: " + nome);
		System.out.println("Departamento.......: " + departamento);
		System.out.println("Sálario............: " + salario);
		if (this.estadoNaEmpresa == true) {
			System.out.println("Estado na Empresa..: Funcionário Empregado");
		} else {
			System.out.println("Estado na Empresa..: Funcionário demitido");
		}
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
