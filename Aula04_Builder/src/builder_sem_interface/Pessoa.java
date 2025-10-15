package builder_sem_interface;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	//Atributos
	
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	private Endereco endereco;
	private List telefones = new ArrayList();
	
	//Construtor
	
	public Pessoa(String nome, String sobrenome, int dia, int mes, int ano, Endereco endereco, List telefones) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.endereco = endereco;
		this.telefones = telefones;		
		
	}
	
	//Métodos

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano
				+ ", endereco=" + endereco + ", telefones=" + telefones + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List getTelefones() {
		return telefones;
	}

	public void setTelefones(List telefones) {
		this.telefones = telefones;
	}
	
	

}
