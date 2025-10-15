package proxy_mensagem;

public class ProxyMensagem implements Mensagem{
	
	//Atributos
	
	private MensagemReal msg = new MensagemReal();
	
	//Métodos
	
	@Override
	public void mostrarMensagem() {
		System.out.println("Proxy executa algo ANTES de MensagemReal!");
		msg.mostrarMensagem();
		System.out.println("Proxy executa algo DEPOIS de MensagemReal!");
		
	}
	

}
