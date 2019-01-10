package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String RG;
	private double ganhoAnual;
	private int identificador;
	private static int contador = 0;

	public Funcionario() {
		contador++;
		this.identificador = contador;
	}

	public Funcionario(String nome) {
		contador++;
		this.identificador = contador;
		this.nome = nome;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double calculaGanhoAnual() {
		if (this.salario != 0.0)
			ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	public void mostra() {
		System.out.println("Identificador...: " + identificador);
		System.out.println("Nome............: " + nome);
		System.out.println("RG..............: " + RG);
		System.out.println("Departamento....: " + departamento);
		System.out.println("Salario.........: " + salario);
		System.out.println("Ganho Anual.....: " + calculaGanhoAnual());
		if (dataDeEntrada != null) {
			System.out.println(dataDeEntrada.getFormatada() + "\n");
		} else {
			System.out.println("Data não informada \n");
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

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}
}
