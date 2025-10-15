package factory_pratos;

public class PratoFactory {

	public static Prato get(Cliente cliente) {

		if (cliente.getPreferencia() == 'V') {
			return new PratoVegano("Master CHUCHU", 50, 40, 50.0);
		} else {

			if (cliente.getPreferencia() == 'C') {
				return new PratoCarnivoro("Picanha e Cebola", 60.9, 50.6, 89.6);

			} else {
				return new PratoPadrao("Prato feito", 10.5, 56, 140, 4);

			}

		}

	}

}
