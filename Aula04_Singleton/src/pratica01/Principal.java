package pratica01;

public class Principal {
	
	public static void main(String[] args) {
		
		Display.valor = 10;
		
		Display.mostrar();
		
		Display disp = new Display();
		
		disp.incremetaValor();
		
		Display.mostrar();
		
		
		
	}

}
