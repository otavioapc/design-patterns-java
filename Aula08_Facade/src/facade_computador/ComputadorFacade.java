package facade_computador;

public class ComputadorFacade {
	
	//Atributos
	
	private Cpu cpu;
	private Memoria memoria;
	private Hd hd;
	
	//Construtor
	
	public ComputadorFacade() {
		cpu = new Cpu(5.7, 4);
		memoria = new Memoria(6000000, 0);
		hd = new Hd(4000000);
		
	}
	
	//Métodos
	
	public void ligarComputador() {
		int BOOT_SECTOR = 20;
		int SECTOR_SIZE = 2048;
		int BOOT_ADDRESS = 2526;
		
		cpu.iniciar();
		
		String hdBootInfo = hd.ler(BOOT_ADDRESS, SECTOR_SIZE);
		memoria.carregar(BOOT_ADDRESS, hdBootInfo);
		
		cpu.executar();
		
	}
	
	public void desligarComputador() {
		hd.escrever(5020, "Último status do SO");
		cpu.desligar();
		
	}

}
