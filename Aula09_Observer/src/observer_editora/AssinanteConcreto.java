package observer_editora;

public class AssinanteConcreto implements Assinante{
	
	//Atributos
	
	private String nome; //Nome do Assinante
	
	//Construtor
	
	public AssinanteConcreto(String nome) {
		this.nome = nome;
		
	}
	
	//Métodos

	@Override
	public void publicar(String mensagem) {
		System.out.println("Assinante " + nome + " recebeu a mensagem: " + mensagem);
		
	}
	
}
