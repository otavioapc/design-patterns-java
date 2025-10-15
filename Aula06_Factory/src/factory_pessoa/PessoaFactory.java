package factory_pessoa;

public class PessoaFactory {

	// Métodos

	public static Pessoa getPessoa(String nome, String sexo, int idade) {
		if (sexo.equals("M")) {
			return new Homem(nome, idade);
		} else if (sexo.equals("F")) {
			return new Mulher(nome, idade);
		} else {
			return null;
		}

	}

}
