package trabalho_factory;

public class PorHora extends Empregado{
	
	//Atributos
	
	private double valorHora;
	private double quantHoras;
	
	//Construtor
	
	public PorHora(String nome, String email, int anoDeContratacao, double valorHora, double quantHoras) {
		super(nome, email, anoDeContratacao);
		this.valorHora = valorHora;
		this.quantHoras = quantHoras;
		
	}
	
	//Métodos
	
	@Override
	public double ganhar() {
		
		return this.valorHora * this.quantHoras;
	}

	@Override
	public String toString() {
		return "PorHora [valorHora=" + valorHora + ", quantHoras=" + quantHoras + ", ganhar()=" + ganhar()
				+ ", tempoCasa()=" + tempoCasa() + ", toString()=" + super.toString() + "]";
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQuantHoras() {
		return quantHoras;
	}

	public void setQuantHoras(double quantHoras) {
		this.quantHoras = quantHoras;
	}
	
	

}
