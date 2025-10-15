package facade_computador;

public class Memoria {

	// Atributos

	private int tamanho;
	private int ocupada;

	// Construtor

	public Memoria(int tamanho, int ocupada) {
		this.tamanho = tamanho;
		this.ocupada = ocupada;

	}

	// Métodos

	public void carregar(int posicao, String info) {
		System.out.println("Carrega dados na memória");
		this.ocupada = this.ocupada + info.length();

	}

	public void liberar(int posicao, String info) {
		System.out.println("Libera dados da memória");
		this.ocupada = this.ocupada - info.length();

	}

	public String ler(int posicao, int tamanho) {
		return "DADOS LIDOS DA MEMÓRIA";

	}

	public int getTamanho() {
		return tamanho;
	}

	public int getOcupada() {
		return ocupada;
	}

}
