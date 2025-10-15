package arquivo;

public class Principal {
	
	public static void main(String[] args) {
		

		Arquivo aplic01 = Arquivo.getInstancia();
		Arquivo aplic02 = Arquivo.getInstancia();		
		
		aplic01.gravaArquivo("Mahomes");
		aplic01.gravaArquivo("McDuffie");
		aplic02.gravaArquivo("Kelce");
		
		
		
		
	}

}
