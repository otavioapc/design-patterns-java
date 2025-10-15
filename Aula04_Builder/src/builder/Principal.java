package builder;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		PessoaBuilder pessoaBuilder = new PessoaBuilder();
		
		pessoaBuilder.setNome("Otávio", "Augusto");
		pessoaBuilder.setDataNascimento(8, 10, 2005);
		pessoaBuilder.setEndereco("Rua Morango", "87", "Perto do Lago", "Salada de Frutas", "Curitiba", "Brasil");
		pessoaBuilder.setFone(41, 965321548, "Fixo");
		
		
		Pessoa pessoa = pessoaBuilder.get();
		System.out.println(pessoa.toString());
		
		
	}

}
