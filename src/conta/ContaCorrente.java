package conta;

/**
 * @author ulisses
 *
 */
public class ContaCorrente extends Conta {

	public double atualiza(double taxa) {
		super.atualiza(taxa);
		this.saldo = taxa * 2 + saldo;
		return saldo;
	}
}
