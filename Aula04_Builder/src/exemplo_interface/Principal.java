package exemplo_interface;

public class Principal {
	
	public static void main(String[] args) {
		
		Brasileiro br = new Brasileiro();
		Americano amr = new Americano();
		Frances fr = new Frances();
		
		br.dizOi();
		amr.dizOi();
		fr.dizOi();
		System.out.println();
		br.dizTchau();
		amr.dizTchau();
		fr.dizTchau();
		System.out.println();
		br.dizBomdia();
		amr.dizBomdia();
		fr.dizBomdia();
		
		
	}

}
