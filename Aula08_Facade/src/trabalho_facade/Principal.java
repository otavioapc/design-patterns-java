package trabalho_facade;

public class Principal {
	
	public static void main(String[] args) {
		
		RestauranteFacade restaurante = new RestauranteFacade();

		 System.out.println("Pedido 1");
		 restaurante.fazerPedido("Pizza", 80.0);

		 System.out.println(" ");
		 System.out.println("Pedido 2");
		 restaurante.fazerPedido("Pizza", 70.0);
		 System.out.println(" ");
		 System.out.println("Pedido 3");
		 restaurante.fazerPedido("Lasanha", 90.0);

		 System.out.println(" ");
		 System.out.println("Pedido 4");
		 restaurante.fazerPedido("Lasanha", 60.0);
		 System.out.println(" ");
		 System.out.println("Pedido 5");
		 restaurante.fazerPedido("Calzone", 60.0); 
		
	}

}
