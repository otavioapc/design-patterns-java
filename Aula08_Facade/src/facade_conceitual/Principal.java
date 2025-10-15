package facade_conceitual;

public class Principal {
	
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		facade.executarTarefa();
		System.out.println();
		facade.concluirTarefa();
		
	}

}
