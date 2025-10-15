package trabalho_factory;

public class Principal {
	
	public static void main(String[] args) {
		
		String nome = "Otávio Augusto";
		String email = "tavinho@gmail.com";
		int anoContratacao = 2005;
		
//		public static Empregado getEmpregado(String nome, String email, int anoDeContratacao, double salario, double comissao, int vendas, double valorDeProducao, int quantidade, double valorHora, double quantHora)
		Empregado emp1 = EmpregadoFactory.getEmpregado(nome, email, anoContratacao, 1.900, 0, 0, 0, 0, 0, 0);		
		System.out.println(emp1.toString());
		System.out.println();
		
		Empregado emp2 = EmpregadoFactory.getEmpregado(nome, email, anoContratacao, 1900, 5, 200, 0, 0, 0, 0);
		System.out.println(emp2.toString());
		System.out.println();
		
		Empregado emp3 = EmpregadoFactory.getEmpregado(nome, email, anoContratacao, 0, 0, 0, 200, 60, 0, 0);
		System.out.println(emp3.toString());
		System.out.println();
		
		Empregado emp4 = EmpregadoFactory.getEmpregado(nome, email, anoContratacao, 0, 0, 0, 0, 0, 60, 200);
		System.out.println(emp4.toString());
	
		
	}

}
