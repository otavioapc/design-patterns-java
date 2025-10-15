package facade_jogos;

public class SistemasFacade {
	
	//Atributos
	
	private SistemaDeAudio audio;
	private SistemaDeInput input;
	private SistemaDeVideo video;
	
	//Construtor
	
	public SistemasFacade() {
		video = new SistemaDeVideo();
		input = new SistemaDeInput();
		audio = new SistemaDeAudio();
		
	}
	
	//Métodos
	
	public void inicializarSubsistemas() {
		
		video.configurarCores();
		video.configurarResolucao();
		
		input.configurarJoystick();
		input.configurarTeclado();
		
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
		
	}
	
	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
		
	}
	
	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
		
	}
	
	public void lerInput() {
		input.lerInput();
		
	}

}
