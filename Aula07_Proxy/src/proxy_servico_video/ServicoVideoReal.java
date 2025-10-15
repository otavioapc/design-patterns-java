package proxy_servico_video;

public class ServicoVideoReal implements ServicoVideo{
	
	//Métodos

	@Override
	public void playVideo(String videoId) {
		
		System.out.println("Reproduzindo vídeo com o ID: "+videoId);
		
	}

}
