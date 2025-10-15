package factory_pratos;

public class Cliente {
	
	//Atributos
	
	private String nome;
	private char preferencia;
	
	//Construtor
	
	public Cliente(String nome, char preferencia) {
		super();
		this.nome = nome;
		this.preferencia = preferencia;
				
	}

	//Métodos
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", preferencia=" + preferencia + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getPreferencia() {
		return preferencia;
	}


	public void setPreferencia(char preferencia) {
		this.preferencia = preferencia;
	}	

}
