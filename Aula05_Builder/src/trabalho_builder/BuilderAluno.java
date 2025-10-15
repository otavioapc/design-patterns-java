package trabalho_builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderAluno {
	
	//Atributos
	
	private Aluno aluno;
	private Formacao formacao;
	private Endereco endereco;
	private Turma turma;
	private List<Telefone> telefones;
	
	//Construtor
	
	public BuilderAluno() {
		this.aluno = new Aluno();
		this.formacao = new Formacao();
		this.endereco = new Endereco();
		this.turma = new Turma();
		this.telefones = new ArrayList<Telefone>();
		
		aluno.setFormacao(formacao);
		aluno.setEndereco(endereco);
		aluno.setTurma(turma);
		aluno.setTelefones(telefones);
		
	}
	
	//Métodos
	
	public void setAluno(String nome, String sobrenome, int dia, int mes, int ano, String cpf, String email) {
		this.aluno.setNome(nome);
		this.aluno.setSobrenome(sobrenome);
		this.aluno.setDia(dia);
		this.aluno.setMes(mes);
		this.aluno.setAno(ano);
		this.aluno.setCpf(cpf);
		this.aluno.setEmail(email);
		
	}
	
	public void setEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String pais) {
		this.endereco.setLogradouro(logradouro);
		this.endereco.setNumero(numero);
		this.endereco.setComplemento(complemento);
		this.endereco.setBairro(bairro);
		this.endereco.setCidade(new Cidade(cidade, estado, pais));
		
	}
	public void setFormacao(int ano, String instituicao, String cidade, String estado, String pais) {
		this.formacao.setAno(ano);
		this.formacao.setInstituicao(instituicao);
		this.formacao.setCidade(new Cidade(cidade, estado, pais));
		
	}
	public void setTurma(int numero, int ano, String descricao) {
		this.turma.setNumero(numero);
		this.turma.setAno(ano);
		this.turma.setDescricao(descricao);
	}
	public void setFone(int ddd, int numero, String tipoFone) {
		this.telefones.add(new Telefone(ddd, numero, tipoFone));
		
	}
	
	public Aluno get() {
		return aluno;
		
	}

}
