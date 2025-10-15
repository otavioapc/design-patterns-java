package facade_computador;

public class Hd {
	
	//Atributos
	
	private int capacidade;
	
	//Construtor
	
	public Hd(int capacidade) {
		this.capacidade = capacidade;
		
	}
	
	//Métodos
	
	public String ler(int posicaoInicial, int size) {
		System.out.println("Ler dados do HD");
		return "INFORMAÇÃO LIDA DO HD";
		
	}
	
	public void escrever(int posicao, String info) {
		System.out.println("Escreve dados no HD");
		System.out.println("Posição: "+ posicao + " Informação: " + info);
		
	}

	public int getCapacidade() {
		return capacidade;
	}

}
