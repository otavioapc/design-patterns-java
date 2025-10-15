package factory_pratos;

public class PratoVegano extends Prato{
	
	//Atributos
	
	private double quantidadeVerduras;
	private double quantidadeLegumes;
	
	//Construtor

	public PratoVegano(String nome, double calorias, double quantidadeVerduras, double quantidadeLegumes) {
		super(nome, calorias);
		this.quantidadeVerduras = quantidadeVerduras;
		this.quantidadeLegumes = quantidadeLegumes;
		
	}
	
	//Métodos

	@Override
	public String toString() {
		return "PratoVegano [quantidadeVerduras=" + quantidadeVerduras + ", quantidadeLegumes=" + quantidadeLegumes
				+ ", nome=" + nome + ", calorias=" + calorias + "]";
	}

	public double getQuantidadeVerduras() {
		return quantidadeVerduras;
	}

	public void setQuantidadeVerduras(double quantidadeVerduras) {
		this.quantidadeVerduras = quantidadeVerduras;
	}

	public double getQuantidadeLegumes() {
		return quantidadeLegumes;
	}

	public void setQuantidadeLegumes(double quantidadeLegumes) {
		this.quantidadeLegumes = quantidadeLegumes;
	}	

}
