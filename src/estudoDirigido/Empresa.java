package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class Empresa {
	private String nome;
	private String CNPJ;
	private Funcionario[] empregados;
	private int posicao = 0;

	public Empresa(int tamanho) {
		this.empregados = new Funcionario[tamanho];
	}

	public void adicionar(Funcionario funcionario) {
		if (posicao < empregados.length) {
			empregados[posicao] = funcionario;
			posicao++;
		} else {
			System.out.println("Matriz cheia");
		}
	}

	public void mostrarEmpregados() {
		for (int i = 0; i < posicao; i++) {
			empregados[i].mostra();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}
