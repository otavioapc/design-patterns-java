package singleton;

public class Principal {

	public static void main(String[] args) {

		Singleton sing01 = Singleton.getInstancia();
		Singleton sing02 = Singleton.getInstancia();

		if (sing01 == sing02) {

			System.out.println("Esses objetos são iguais!");

		} else {

			System.out.println("Esses objetos não são iguais!");

		}

	}

}
