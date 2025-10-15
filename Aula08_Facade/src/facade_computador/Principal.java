package facade_computador;

public class Principal {
	
	public static void main(String[] args) {
		
		ComputadorFacade compFacade = new ComputadorFacade();
		
		compFacade.ligarComputador();
		System.out.println();
		compFacade.desligarComputador();
		
	}

}
