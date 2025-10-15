package proxy_servico_video;

public class ProxyServicoVideo implements ServicoVideo {

	private ServicoVideoReal servicoReal = new ServicoVideoReal();

	// Métodos

	@Override
	public void playVideo(String videoId) {

		if (validarPermissao(videoId)) {
			servicoReal.playVideo(videoId);

		} else {
			System.err.println("Você não tem permissão para assistir esse vídeo!");

		}

	}

	private boolean validarPermissao(String videoId) {

		if (videoId.length() % 2 == 0) {
			return true;

		} else {
			return false;

		}

	}

}
