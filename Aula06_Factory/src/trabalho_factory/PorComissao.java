package trabalho_factory;

public class PorComissao extends Empregado {

	// Atributos

	private double salario;
	private double comissao;
	private int vendas;

	// Construtor

	public PorComissao(String nome, String email, int anoDeContratacao, double salario, double comissao, int vendas) {
		super(nome, email, anoDeContratacao);
		this.salario = salario;
		this.comissao = comissao;
		this.vendas = vendas;

	}

	// Métodos

	@Override
	public double ganhar() {

		return this.salario + (this.comissao * this.vendas);
	}

	@Override
	public String toString() {
		return "PorComissao [salario=" + salario + ", comissao=" + comissao + ", vendas=" + vendas + ", ganhar()="
				+ ganhar() + ", tempoCasa()=" + tempoCasa() + ", toString()=" + super.toString() + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

}
