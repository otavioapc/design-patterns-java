package factory_pessoa;

public class Principal {
	
	public static void main(String[] args) {
		
		String nome;
		String sexo;
		int idade;
		
		nome = "Carlos";
		sexo = "M";
		idade = 30;
		
		Pessoa pessoa1 = PessoaFactory.getPessoa(nome, sexo, idade);
		System.out.println(pessoa1.getClass());
		System.out.println(pessoa1.toString());
		
		nome = "Maria";
		sexo = "F";
		idade = 25;
		
		Pessoa pessoa2 = PessoaFactory.getPessoa(nome, sexo, idade);
		System.out.println(pessoa2.toString());
		
	}

}
