package factory_pratos;

public class PratoCarnivoro extends Prato{
	
	//Atributos
	
	private double quantidadeBovino;
	private double quantidadeFrango;
	
	//Construtor
	
	public PratoCarnivoro(String nome, double calorias, double quantidadeBovino, double quantidadeFrango) {
		super(nome, calorias);
		this.quantidadeBovino = quantidadeBovino;
		this.quantidadeFrango = quantidadeFrango;
		
	}

	//Métodos
	
	@Override
	public String toString() {
		return "PratoCarnivoro [quantidadeBovino=" + quantidadeBovino + ", quantidadeFrango=" + quantidadeFrango
				+ ", nome=" + nome + ", calorias=" + calorias + "]";
	}
	
	public double getQuantidadeBovino() {
		return quantidadeBovino;
	}

	public void setQuantidadeBovino(double quantidadeBovino) {
		this.quantidadeBovino = quantidadeBovino;
	}

	public double getQuantidadeFrango() {
		return quantidadeFrango;
	}

	public void setQuantidadeFrango(double quantidadeFrango) {
		this.quantidadeFrango = quantidadeFrango;
	}	

}
