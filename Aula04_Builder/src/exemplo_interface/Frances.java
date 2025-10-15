package exemplo_interface;

public class Frances implements Pessoa{

	@Override
	public void dizOi() {
		System.out.println("Hé!");
		
	}

	@Override
	public void dizTchau() {
		System.out.println("Salut!");
		
	}

	@Override
	public void dizBomdia() {
		System.out.println("Bonjour!");
		
	}

}
