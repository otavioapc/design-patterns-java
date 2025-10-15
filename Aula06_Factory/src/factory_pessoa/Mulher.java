package factory_pessoa;

public class Mulher extends Pessoa{
	
	//Construtor
	
	public Mulher(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Olá Senhora " + this.nome);
		
	}
	
	//Métodos

	@Override
	public String toString() {
		return "Mulher [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
