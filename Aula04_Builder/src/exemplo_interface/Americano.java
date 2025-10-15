package exemplo_interface;

public class Americano implements Pessoa{

	@Override
	public void dizOi() {
		System.out.println("Hello!");
		
	}

	@Override
	public void dizTchau() {
		System.out.println("Bye!");
		
	}

	@Override
	public void dizBomdia() {
		System.out.println("Good morning!");
		
	}

}
