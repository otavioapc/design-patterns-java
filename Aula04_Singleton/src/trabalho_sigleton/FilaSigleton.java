package trabalho_sigleton;

import java.util.ArrayList;

public class FilaSigleton {
	
	//Atributos
	
	private static FilaSigleton filaSigleton;
	private ArrayList<Usuario> filaUsuario;
	
	//Construtor
	
	private FilaSigleton() {
		filaUsuario = new ArrayList<>();
		
	}
	
	//Métodos
	
	public static FilaSigleton getInstancia() {
		
		if(filaSigleton == null) {
			filaSigleton = new FilaSigleton();
			
		}
		
		return filaSigleton;
		
	}
	
	public void adicionarUsuario(Usuario user) {
		filaUsuario.add(user);
		
	}
	
//	public Usuario retirarUsuario() {
//		
//		
//		
//	}

}
