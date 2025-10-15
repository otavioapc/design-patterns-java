package builder_com_interface;

public class BuilderSUV implements Builder{
	
	//Atributos
	
	private Carro carro;
	private Motor motor;
	private Transmissao transmissao;
	private Gps gps;
	
	//Construtor
	
	public BuilderSUV() {
		this.carro = new Carro();
		this.carro.setTipo("SUV");
		this.carro.setPortas(4);
		
		this.motor = new Motor();
		this.motor.desligar();
		
		this.transmissao = new Transmissao();
		transmissao.setTipo("Automático");
		
		this.gps = new Gps();
		
		this.carro.setMotor(motor);
		this.carro.setGps(gps);
		this.carro.setTransmissao(transmissao);
		
	}
	
	//Métodos

	@Override
	public void setCapacidadeTanque(double capacidadetanque) {
		this.carro.setCapacidadeTanque(capacidadetanque);
		
	}

	@Override
	public void setMotorVolume(double volume) {
		this.motor.setVolume(volume);
		
	}

	@Override
	public void setMotorPotencia(int potencia) {
		this.motor.setPotencia(potencia);
		
	}

	@Override
	public void setMotorKilometragem(int kilometragem) {
		this.motor.setKilometragem(kilometragem);
		
	}

	@Override
	public void setTransmissaoQuantMarchas(int quantMarchas) {
		this.transmissao.setQuantMarchas(quantMarchas);
		
	}

	@Override
	public void setGpsRota(String rota) {
		this.gps.setRota(rota);
		
	}

	@Override
	public void setGpsMarca(String marca) {
		this.gps.setMarca(marca);
		
	}

	@Override
	public void setGpsMoledo(String modelo) {
		this.gps.setModelo(modelo);
		
	}
	
	public Carro get() {
		
		return this.carro;
		
	}

}
