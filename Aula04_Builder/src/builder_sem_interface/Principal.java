package builder_sem_interface;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		List telefones = new ArrayList();		
		Telefone tel1 = new Telefone(41, 99652314, "Fixo");
		Telefone tel2 = new Telefone(42, 987546352, "Móvel");		
		telefones.add(tel1);
		telefones.add(tel2);
		
		Endereco end = new Endereco("Rua Abacaxi", "15", "Perto do Mercado", "Salada de Frutas", "Curitiba", "Brasil");
		
		Pessoa p1 = new Pessoa("Patrick", "Mahomes", 1, 1, 2000, end, telefones);
		
		System.out.println(p1.toString());
		
	}

}
