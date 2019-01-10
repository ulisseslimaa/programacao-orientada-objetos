package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class TesteFuncionario {
	public static void main(String[] args) {
		
//		Criando Funcionario (Dados Completos)
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Pedro Henrique");
		
		funcionario1.setDataDeEntrada(new Data());
		funcionario1.getDataDeEntrada().dia = 01;
		funcionario1.getDataDeEntrada().mes = 01;
		funcionario1.getDataDeEntrada().ano = 2019;
		
		funcionario1.setDepartamento("CPD");
		funcionario1.setRG("39874582");
		funcionario1.setSalario(10000);
		
		funcionario1.recebeAumento(3000);
		funcionario1.calculaGanhoAnual();
		
		funcionario1.mostra();
		
//		Criando Funcionário (Dados Incompletos)
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setDepartamento("T.I");
		funcionario2.setRG("39874582");
		funcionario2.setSalario(7000);
		funcionario2.recebeAumento(1000);
		funcionario2.calculaGanhoAnual();
		funcionario2.mostra();
		
//		Criando Funcionário (Dados Incompletos)
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Pedro Alvarez Cabral");
		funcionario3.setDataDeEntrada(new Data());
		funcionario3.getDataDeEntrada().dia = 10;
		funcionario3.getDataDeEntrada().mes = 11;
		funcionario3.getDataDeEntrada().ano = 2018;
		funcionario3.setDepartamento("Recursos Humanos");
		funcionario3.mostra();

	}
}
