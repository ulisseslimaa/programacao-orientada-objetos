package atividadeV;

/**
 * @author ulisses
 *
 */
public class Cachorro {
	 String Nome;
	 String Raça;
	 Rabo rabo;

	public Cachorro() {
		
	}

	void latir() {
		System.out.println("Au, au!");
	}

	void pular(double altura) {
		if (altura < 1) {
			System.out.println("Pulou com Sucesso!");
		} else {
			System.out.println("Não Deu!");
		}
	}

	boolean comer(int alimento) {
		boolean resultado;
		if (alimento < 300) {
			System.out.println("Alimento Insuficiente");
			resultado = false;
		} else {
			System.out.println("Animal Alimentado");
			resultado = false;
		}
		return resultado;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	public Rabo getRabo() {
		return rabo;
	}

	public void setRabo(Rabo rabo) {
		this.rabo = rabo;
	}
	
}
