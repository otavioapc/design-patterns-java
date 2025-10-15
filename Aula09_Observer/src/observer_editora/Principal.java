package observer_editora;

public class Principal {
	
	public static void main(String[] args) {
		
		EditoraConcreta editora = new EditoraConcreta();
		
		AssinanteConcreto ass1 = new AssinanteConcreto("Mahomes");
		AssinanteConcreto ass2 = new AssinanteConcreto("Kelce");
		
		editora.assinarEditora(ass1);
		editora.assinarEditora(ass2);
		
		editora.setEstado("Publicando Revista");
		editora.setEstado("Publicando Jornal");
		
		editora.cancelarEditora(ass2);
		
		editora.setEstado("Publicado Jornal");
		
		
		
	}

}
