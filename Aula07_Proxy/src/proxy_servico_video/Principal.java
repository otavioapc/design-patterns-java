package proxy_servico_video;

public class Principal {
	
	public static void main(String[] args) {
		
		ProxyServicoVideo videoService = new ProxyServicoVideo();
		videoService.playVideo("Batman");
		videoService.playVideo("HER");
	
	}

}
