package facade_conceitual;

public class Facade {
	
	//Atributos
	
	private SubSistemaA subA;
	private SubSistemaB subB;
	private SubSistemaC subC;
	private SubSistemaD subD;
	
	//Construtor
	
	public Facade() {
		super();
		this.subA = new SubSistemaA();
		this.subB = new SubSistemaB();
		this.subC = new SubSistemaC();
		this.subD = new SubSistemaD();
		
	}
	
	//Métodos
	
	public void executarTarefa() {
		subA.operacaoA();
		subB.operacaoB();
		subC.operacaoC();
		subD.operacaoD();
		
	}
	
	public void concluirTarefa() {
		subA.concluirOperacaoA();
		subB.concluirOperacaoB();
		subC.concluirOperacaoc();
		subD.concluirOperacaoD();
		
	}
	

}
