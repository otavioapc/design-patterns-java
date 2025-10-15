package factory_pratos;

public abstract class Prato {

	// Atributos

	protected String nome;
	protected double calorias;

	// Construtor

	public Prato(String nome, double calorias) {
		super();
		this.nome = nome;
		this.calorias = calorias;
	}

	// Métodos

	@Override
	public String toString() {
		return "Prato [nome=" + nome + ", calorias=" + calorias + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

}
