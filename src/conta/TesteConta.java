package conta;

/**
 * @author ulisses
 *
 */
public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 1000;
		conta.deposita(2000);
		conta.saca(1000);
		conta.atualiza(10);
		System.out.println(conta.getSaldo());
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.saldo = 1000;
		conta2.deposita(2000);
		conta2.saca(1000);
		conta2.atualiza(10);
		System.out.println(conta2.getSaldo());
		
		ContaPoupanca conta3 = new ContaPoupanca();
		conta3.saldo = 1000;
		conta3.deposita(2000);
		conta3.saca(1000);
		conta3.atualiza(10);
		System.out.println(conta3.getSaldo());

	}

}
