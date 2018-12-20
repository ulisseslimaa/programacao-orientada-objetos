package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class TesteEmpresa {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Pedro");
		Funcionario f2 = new Funcionario("João");
		Funcionario f3 = new Funcionario("Maria");
		Funcionario f4 = new Funcionario("Adriana");
		Empresa e = new Empresa(3);
		e.adicionar(f);
		e.adicionar(f2);
		e.adicionar(f3);
		// e.adicionar(f4);
		e.mostrarEmpregados();
	}
}
