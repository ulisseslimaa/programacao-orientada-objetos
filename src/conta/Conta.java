package conta;

/**
 * @author ulisses
 *
 */
public class Conta {
	double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double deposita(double valor) {
		this.saldo = saldo + valor;
		return saldo;
	}

	public double saca(double valor) {
		this.saldo = saldo - valor;
		return saldo;
	}
    //atualiza o salario, taxa - porcentagem 
	public double atualiza(double taxa) {
		double porcentagem = saldo * taxa / 100;
		this.saldo = porcentagem + saldo;
		return saldo;
	}
}
