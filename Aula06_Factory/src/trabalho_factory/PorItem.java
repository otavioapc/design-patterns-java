package trabalho_factory;

public class PorItem extends Empregado {

	// Atributos

	private double valorProducao;
	private int quantidade;

	// Construtor

	public PorItem(String nome, String email, int anoDeContratacao, double valorProducao, int quantidade) {
		super(nome, email, anoDeContratacao);
		this.valorProducao = valorProducao;
		this.quantidade = quantidade;
		
	}
	
	//Métodos

	@Override
	public double ganhar() {
		
		return valorProducao * quantidade;
	}

	@Override
	public String toString() {
		return "PorItem [valorProducao=" + valorProducao + ", quantidade=" + quantidade + ", ganhar()=" + ganhar()
				+ ", getValorProducao()=" + getValorProducao() + ", getQuantidade()=" + getQuantidade()
				+ ", tempoCasa()=" + tempoCasa() + ", toString()=" + super.toString() + "]";
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
