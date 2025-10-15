package observer_trabalho;

public interface Editora {
	
	public void assinarEditora(Assinante assinante, int assunto);
	public void cancelarEditora(Assinante assinante, int assunto);
	public void notificarAssinantes(String mensagem, int assunto);

}
