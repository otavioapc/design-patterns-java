package builder_com_interface;

public class Principal {
	
	public static void main(String[] args) {
		
		BuilderEsportivo carroEsportivo = new BuilderEsportivo();
		
		carroEsportivo.setCapacidadeTanque(75);
		
		carroEsportivo.setGpsMarca("Philco");
		carroEsportivo.setGpsMoledo("1AXX9087");
		
		carroEsportivo.setMotorKilometragem(2432);
		carroEsportivo.setMotorPotencia(578);
		carroEsportivo.setMotorVolume(2500);
		
		carroEsportivo.setTransmissaoQuantMarchas(6);
		
		Carro esportivo = carroEsportivo.get();
		
		System.out.println(esportivo.toString());
		
		esportivo.getMotor().andar(10);
		esportivo.getMotor().ligar();
		esportivo.getMotor().andar(1000);
		
		System.out.println(esportivo.toString());
		System.out.println();
		
		Carro esportivo2 = carroEsportivo.get();
		esportivo.getMotor().setVolume(10000);
		System.out.println(esportivo2.toString());
		
		BuilderSUV carroSUV = new BuilderSUV();
		
		carroSUV.setCapacidadeTanque(90);
		
		carroSUV.setGpsMarca("Samsung");
		carroSUV.setGpsMoledo("156LKX");
		
		carroSUV.setMotorKilometragem(500);
		carroSUV.setMotorPotencia(600);
		carroSUV.setMotorPotencia(3000);
		
		carroSUV.setTransmissaoQuantMarchas(10);
		
		Carro suv = carroSUV.get();
		
		System.out.println();
		System.out.println(suv.toString());
		
	}

}
