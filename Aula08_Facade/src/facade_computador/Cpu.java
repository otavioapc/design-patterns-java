package facade_computador;

public class Cpu {

	// Atributos

	private double clock;
	private int status; // 1 - ligada, 2 - processando, 3 - repouso, 4 – desligada

	// Construtor

	public Cpu(double clock, int status) {
		this.clock = clock;
		this.status = status;

	}

	// Métodos

	public void iniciar() {
		System.out.println("Inicialização inicial da CPU");
		this.status = 1;

	}

	public void executar() {
		System.out.println("Executa algo no processador");
		this.status = 2;

	}

	public void carregar() {
		if (this.status != 2) {
			this.status = 2;
		}
		System.out.println("Carrega registrador");

	}

	public void liberar() {
		System.out.println("Libera registradores");
		this.status = 3;

	}

	public void desligar() {
		System.out.println("Desliga CPU");
		this.status = 4;

	}

}
