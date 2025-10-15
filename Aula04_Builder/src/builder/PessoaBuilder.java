package builder;

import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {

	// Atributos

	private Pessoa pessoa;
	private Endereco endereco;
	private List<Telefone> telefones;

	// Construtor

	public PessoaBuilder() {
		this.pessoa = new Pessoa();
		this.endereco = new Endereco();
		this.telefones = new ArrayList<Telefone>();

		pessoa.setEndereco(endereco);
		pessoa.setTelefones(telefones);

	}

	// Métodos

	public void setNome(String nome, String sobrenome) {
		this.pessoa.setNome(nome);
		this.pessoa.setSobrenome(sobrenome);

	}

	public void setDataNascimento(int dia, int mes, int ano) {
		this.pessoa.setDia(dia);
		this.pessoa.setMes(mes);
		this.pessoa.setAno(ano);

	}

	public void setEndereco(String logradouro, String numero, String complemento, String bairro, String cidade,
			String pais) {
		this.endereco.setLogradouro(logradouro);
		this.endereco.setNumero(numero);
		this.endereco.setComplemento(complemento);
		this.endereco.setBairro(bairro);
		this.endereco.setCidade(cidade);
		this.endereco.setPais(pais);

	}

	public void setFone(int ddd, int numero, String tipoFone) {
		
		this.telefones.add(new Telefone(ddd,numero,tipoFone));
		
	}
	
	public Pessoa get() {
		
		return this.pessoa;
	}

}
