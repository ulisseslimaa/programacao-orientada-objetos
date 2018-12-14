package atividadeV;

/**
 * @author ulisses
 *
 */
public class TesteCachorro {
	public static void main(String[] args) {
		Cachorro rex = new Cachorro();
		Rabo rabo = new Rabo();
		
		rex.rabo = new Rabo();
		rex.rabo = rabo;
		
		rex.latir();
		rex.pular(0);
		rex.comer(350);
		
		rex.rabo.balancar();
			
	}

}
