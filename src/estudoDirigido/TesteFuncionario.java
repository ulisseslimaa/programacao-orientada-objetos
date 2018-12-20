package estudoDirigido;

/**
 * @author ulisses
 *
 */
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Pedro");
		// f.setNome("Pedro");
		f.setDataDeEntrada(new Data());
		f.getDataDeEntrada().dia = 01;
		f.getDataDeEntrada().mes = 01;
		f.getDataDeEntrada().ano = 2017;
		f.setDepartamento("CPD");
		f.setRG("0102");
		f.setSalario(10000);
		f.recebeAumento(3000);
		f.calculaGanhoAnual();
		f.mostra();
	}
}
