package facade_jogos;

public class Principal {
	
	public static void main(String[] args) {
		
		SistemasFacade sistemas = new SistemasFacade();
		
		sistemas.inicializarSubsistemas();
		System.out.println();
		sistemas.renderizarImagem("Mahomes Levantando Vince Lombardi");
		System.out.println();
		sistemas.reproduzirAudio("pinkfloyd.mp3");
		System.out.println();
		sistemas.lerInput();
		
	}

}
