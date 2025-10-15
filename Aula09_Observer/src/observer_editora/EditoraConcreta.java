package observer_editora;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora{
	
	//Atributos
	
	private final List<Assinante> listaAssinantes = new ArrayList<>();
	private String estado; //Representa o estado da Editora
	
	//Métodos

	@Override
	public void assinarEditora(Assinante assinante) {
		listaAssinantes.add(assinante);
		
	}

	@Override
	public void cancelarEditora(Assinante assinante) {
		listaAssinantes.remove(assinante);
		
	}

	@Override
	public void notificarAssinantes(String mensagem) {
		for(Assinante assinante : listaAssinantes) {
			assinante.publicar(mensagem);
		}
		
	}

	public void setEstado(String estado) {
		this.estado = estado;
		notificarAssinantes("Estado atualizado para: "+estado+ "  ");
		
	}
	
	

}
