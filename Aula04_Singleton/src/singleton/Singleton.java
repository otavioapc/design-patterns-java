package singleton;

public class Singleton {

	// Atributo

	private static Singleton instancia;

	// Construtor

	private Singleton() {

	}

	// Métodos

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();

		}

		return instancia;

	}

}
