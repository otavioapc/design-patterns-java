package proxy_mensagem_2;

public class Principal {
	
	public static void main(String[] args) {
		
		ProxyMensagem proxyMsg = new ProxyMensagem();
		
		proxyMsg.mostrarMensagem();
		System.out.println();	
		proxyMsg.mostrarMensagemDois();
		
		
		
	}

}
