package impressora;

public class Empregado {
	
	//Atributos
	
	private String nome;
	private String email;
	private String cargo;
	private double salario;
	
	//Construtor
	
	public Empregado() {		
		
		
	}
	
	//Métodos
	
	public void imprimeEmpregado() {
		
		Impressora impr = Impressora.getImpressora();
		impr.imprime(toString());
		
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + ", cargo=" + cargo + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
