package exemplo_interface;

public class Brasileiro implements Pessoa {

	@Override
	public void dizOi() {
		System.out.println("Olá!");

	}

	@Override
	public void dizTchau() {
		System.out.println("Tchau!");
		
	}

	@Override
	public void dizBomdia() {
		System.out.println("Bom dia!");
		
	}

}
