package trabalho_factory;

public class EmpregadoFactory {

	public static Empregado getEmpregado(String nome, String email, int anoDeContratacao, 
			double salario, double comissao, int vendas, double valorDeProducao, int quantidade, double valorHora, double quantHora) {
		
		if(salario != 0 && comissao == 0) {
			return new Gerente(nome, email, anoDeContratacao, salario);
			
		}
		else {
			if(salario != 0 && comissao != 0) {
				return new PorComissao(nome, email, anoDeContratacao, salario, comissao, vendas);
				
			}
			else {
				if(valorHora != 0) {
					return new PorHora(nome, email, anoDeContratacao, valorHora, quantHora);
					
				}
				else {
					return new PorItem(nome, email, anoDeContratacao, valorDeProducao, quantidade);
					
				}
				
			}
					
		}
		
	}

}
