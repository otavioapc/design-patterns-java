package factory_pratos;

public class PratoPadrao extends Prato {

	// Atributos

	private double quantidadeCarboidratos;
	private double quantidadeProteinas;
	private double quantidadeSalada;

	// Construtor

	public PratoPadrao(String nome, double calorias, double quantidadeCarboidratos, double quantidadeProteina, double quantidadeSalada) {
		super(nome, calorias);
		this.quantidadeCarboidratos = quantidadeCarboidratos;
		this.quantidadeProteinas = quantidadeProteina;
		this.quantidadeSalada = quantidadeSalada;
	}

	// Métodos

	@Override
	public String toString() {
		return "PratoPadrao [quantidadeCarboidratos=" + quantidadeCarboidratos + ", quantidadeProteinas="
				+ quantidadeProteinas + ", quantidadeSalada=" + quantidadeSalada + ", nome=" + nome + ", calorias="
				+ calorias + "]";
	}

	public double getQuantidadeCarboidratos() {
		return quantidadeCarboidratos;
	}

	public void setQuantidadeCarboidratos(double quantidadeCarboidratos) {
		this.quantidadeCarboidratos = quantidadeCarboidratos;
	}

	public double getQuantidadeProteinas() {
		return quantidadeProteinas;
	}

	public void setQuantidadeProteinas(double quantidadeProteinas) {
		this.quantidadeProteinas = quantidadeProteinas;
	}

	public double getQuantidadeSalada() {
		return quantidadeSalada;
	}

	public void setQuantidadeSalada(double quantidadeSalada) {
		this.quantidadeSalada = quantidadeSalada;
	}

}
