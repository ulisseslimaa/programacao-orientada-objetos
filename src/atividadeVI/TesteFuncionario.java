package atividadeVI;

/**
 * @author ulisses
 *
 */
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Lima"); //Definindo o Nome do funcionário
		func.setSalario(1000); //Definindo o salário do funcionário
		func.setDepartamento("R.H."); //Definindo o departamento do funcionário
		func.setEstadoNaEmpresa(true); //Definindo o estado do funcionário na empresa, Empregado.
		
		func.bonifica(10); //Bonifica o funcionário em 10 %
		func.demite(); //Demite o funcionário
		
		func.mostrar(); //Mostra os dados do Funcionário

	}
}
