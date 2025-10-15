package proxy_mensagem_2;

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

	@Override
	public void mostrarMensagemDois() {
		System.out.println("Quem é o G.O.A.T.?");
		msg.mostrarMensagemDois();
		System.out.println("É isso mesmo!");
		
	}
	

}
