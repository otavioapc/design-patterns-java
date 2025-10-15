package trabalho_factory;

public class Gerente extends Empregado{
	

	//Atributos
	
	private double salario;
	
	//Construtor
	
	public Gerente(String nome, String email, int anoDeContratacao, double salario) {
		super(nome, email, anoDeContratacao);
		this.salario = salario;
	}

	@Override
	public double ganhar() {
		
		return this.salario;
	}

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", ganhar()=" + ganhar() + ", tempoCasa()=" + tempoCasa()
				+ ", toString()=" + super.toString() + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
