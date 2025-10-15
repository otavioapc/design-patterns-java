package impressora;

public class Impressora {

	// Atributos

	private static Impressora impressora;
	private int numPagImpressas;

	// Construtor

	private Impressora() {

	}

	// Métodos

	public static Impressora getImpressora() {
		if (impressora == null) {
			impressora = new Impressora();

		}

		return impressora;
	}

	public void imprime(String texto) {
		System.out.println(texto);
		this.numPagImpressas++;
		System.out.println("Nº Páginas Impressas: " + numPagImpressas);
		System.out.println();

	}

}
