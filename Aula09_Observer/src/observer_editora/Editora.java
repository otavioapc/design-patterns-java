package observer_editora;

public interface Editora {
	
	public void assinarEditora(Assinante assinante);
	public void cancelarEditora(Assinante assinante);
	public void notificarAssinantes(String mensagem);

}
