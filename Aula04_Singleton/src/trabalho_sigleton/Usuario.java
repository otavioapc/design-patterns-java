package trabalho_sigleton;

public class Usuario {
	
	//Atributos
	
	private int codigo;
	private String nome;
	
	//Construtor
	
	public Usuario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
			
	}
	
	//Métodos

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + "]";
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
	
	

}
