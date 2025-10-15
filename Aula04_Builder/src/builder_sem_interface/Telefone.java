package builder_sem_interface;

public class Telefone {
	
	//Atributos
	
	private int ddd;
	private int numero;
	private String tipo;
	
	//Construtor
	
	public Telefone(int ddd, int numero, String tipo) {
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		
	}
	
	//Métodos

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
