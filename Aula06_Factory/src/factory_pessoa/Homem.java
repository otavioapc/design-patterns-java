package factory_pessoa;

public class Homem extends Pessoa {

	// Construtor

	public Homem(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Olá Senhor " + this.nome);

	}

	// Métodos

	@Override
	public String toString() {
		return "Homem [nome=" + nome + ", idade=" + idade + "]";
	}

}
