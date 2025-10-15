package builder_com_interface;

public class Carro {

	// Atributos

	private String tipo;
	private int portas;
	private double capacidadeTanque;
	private Motor motor;
	private Transmissao transmissao;
	private Gps gps;

	// Construtor

	// Métodos

	@Override
	public String toString() {
		return "Carro [tipo=" + tipo + ", portas=" + portas + ", capacidadeTanque=" + capacidadeTanque + ", motor="
				+ motor + ", transmissao=" + transmissao + ", gps=" + gps + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public Gps getGps() {
		return gps;
	}

	public void setGps(Gps gps) {
		this.gps = gps;
	}
	

}
