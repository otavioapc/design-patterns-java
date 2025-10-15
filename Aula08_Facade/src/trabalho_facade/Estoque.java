package trabalho_facade;

public class Estoque {

	// Métodos

	public boolean verificarEstoque(String item) {

		if (item.equalsIgnoreCase("Pizza")) {
			System.out.println("Verificando estoque para " + item);
			return true;

		} else {
			if (item.equalsIgnoreCase("Lasanha")) {
				System.out.println("Verificando estoque para " + item);
				return false; // Não há lasanha no estoque
			} else {
				System.out.println("Pedido não pode ser criado!");
				return false;

			}

		}

	}

}
