package funcionario;

/**
 * @author ulisses
 *
 */
public class TesteAplicacao {
	public static void main(String[] args) {
		Professor prof1 = new Professor("Matheus", "174.658.852-40", "20171tprof", 2000, "Educaçao exclusiva");
		Professor prof2 = new Professor("Lucas", "457.688.552-12", "20172tprof", 2500, "Educaçao exclusiva");
		Administrativo adm1 = new Administrativo("João", "123.548.852-40", "20173tprof", 2300, 40);
		Administrativo adm2 = new Administrativo("Paulo", "174.485.4849-40", "20174tprof", 1000, 60);

		prof1.gratificacao();
		prof2.gratificacao();

		prof1.mostrar();
		prof2.mostrar();

		adm1.mostrar();
		adm2.mostrar();

	}

}
