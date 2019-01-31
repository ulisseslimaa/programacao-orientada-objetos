package conta;

/**
 * @author ulisses
 *
 */
public class ContaPoupanca extends Conta {

	public double atualiza(double taxa) {
		super.atualiza(taxa);
		this.saldo = taxa * 3 + saldo;
		return saldo;
	}
}
