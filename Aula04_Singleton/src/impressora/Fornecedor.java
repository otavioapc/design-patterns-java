package impressora;

public class Fornecedor {
	
	//Atributos
	
	private int codigo;
	private String nome;
	private String email;
	private Endereco endereco;
	
	//Construtor
	
	public Fornecedor() {
		
		
	}
	
	//Métodos
	
	public void imprimeFornecedor() {
		
		Impressora impr = Impressora.getImpressora();
		impr.imprime(toString());
		
	}

	@Override
	public String toString() {
		return "Fornecedor [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
