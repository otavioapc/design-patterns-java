package builder_com_interface;

public class Gps {
	
	//Atributos
	
	private String rota;
	private String marca;
	private String modelo;
	
	//Construtor
	
	
	
	//Métodos
	
	@Override
	public String toString() {
		return "Gps [rota=" + rota + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	
	
	
	

}
