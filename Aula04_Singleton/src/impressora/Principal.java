package impressora;

public class Principal {

	public static void main(String[] args) {

//		Impressora imp1 = Impressora.getImpressora();
//		Impressora imp2 = Impressora.getImpressora();
//		Impressora imp3 = Impressora.getImpressora();
//		Impressora imp4 = Impressora.getImpressora();
//		Impressora imp5 = Impressora.getImpressora();
//		
//		imp3.imprime("Otávio Augusto");
//		imp2.imprime("Patrick Mahomes");
//		imp1.imprime("Travis Kelce");

		Empregado emp1 = new Empregado();
		emp1.setNome("Otávio");
		emp1.setEmail("otavio@gmail.com");
		emp1.setCargo("Chefe");
		emp1.setSalario(100000);

		Empregado emp2 = new Empregado();
		emp2.setNome("Maria");
		emp2.setEmail("maria@gmail.com");
		emp2.setCargo("Supervisor");
		emp2.setSalario(80000);

		Empregado emp3 = new Empregado();
		emp3.setNome("João");
		emp3.setEmail("joao@gmail.com");
		emp3.setCargo("Assistente");
		emp3.setSalario(3100);

		emp1.imprimeEmpregado();
		emp2.imprimeEmpregado();
		emp3.imprimeEmpregado();

		Endereco end = new Endereco();
		end.setRua("Abacaxi");
		end.setNumero(12);
		end.setComplemento("Perto de um palmeira");
		end.setBairro("Salada de Frutas");
		end.setCidade("Curitiba");
		end.setEstado("Paraná");

		Fornecedor for1 = new Fornecedor();
		for1.setCodigo(1);
		for1.setNome("Luiza");
		for1.setEmail("luiza@gmail.com");
		for1.setEndereco(end);

		Fornecedor for2 = new Fornecedor();
		for2.setCodigo(2);
		for2.setNome("Gustavo");
		for2.setEmail("gusta@gmail.com");
		for2.setEndereco(end);

		Fornecedor for3 = new Fornecedor();
		for3.setCodigo(3);
		for3.setNome("Pedro");
		for3.setEmail("pedro@gmail.com");
		for3.setEndereco(end);

		for1.imprimeFornecedor();
		for2.imprimeFornecedor();
		for3.imprimeFornecedor();

	}

}
