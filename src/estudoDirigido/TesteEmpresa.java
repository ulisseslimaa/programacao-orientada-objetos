package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class TesteEmpresa {
	public static void main(String[] args) {
//		Limite de Funcionários na Empresa
		Empresa empresaABCD = new Empresa(3);

//		Criando Funcionário
		Funcionario f1 = new Funcionario("Pedro Henrique");
		f1.setDataDeEntrada(new Data());
		f1.getDataDeEntrada().dia = 10;
		f1.getDataDeEntrada().mes = 12;
		f1.getDataDeEntrada().ano = 2018;
		f1.setDepartamento("R.H");
		f1.setRG("1235456");
		f1.setSalario(5000.0);
		f1.recebeAumento(500.0);
		f1.calculaGanhoAnual();

//		Criando Funcionário
		Funcionario f2 = new Funcionario("Paulinho das Meninas");
		f2.setDataDeEntrada(new Data());
		f2.getDataDeEntrada().dia = 1;
		f2.getDataDeEntrada().mes = 7;
		f2.getDataDeEntrada().ano = 2018;
		f2.setDepartamento("Administração");
		f2.setRG("39874582");
		f2.setSalario(998.0);
		f2.calculaGanhoAnual();

//		Criando Funcionário
		Funcionario f3 = new Funcionario("Yuri Black");
		f3.setDataDeEntrada(new Data());
		f3.getDataDeEntrada().dia = 29;
		f3.getDataDeEntrada().mes = 2;
		f3.getDataDeEntrada().ano = 2018;
		f3.setDepartamento("Restaurante");
		f3.setRG("5842157");
		f3.setSalario(4000.0);

//		Criando Funcionário
		Funcionario f4 = new Funcionario("VG Beats");
		f4.setDataDeEntrada(new Data());
		f4.getDataDeEntrada().dia = 9;
		f4.getDataDeEntrada().mes = 1;
		f4.getDataDeEntrada().ano = 2019;
		f4.setDepartamento("R.H");
		f4.setRG("39874582");
		f4.setSalario(2000.0);
		f4.calculaGanhoAnual();

//		Adicionando Funcionários na Empresa
		empresaABCD.adicionar(f1);
		empresaABCD.adicionar(f2);
		empresaABCD.adicionar(f3);
//		empresaABCD.adicionar(f4);

//		Mostrando todos os Funcionários da empresa e seus dados cadastrados!
		empresaABCD.mostrarEmpregados();
	}
}
