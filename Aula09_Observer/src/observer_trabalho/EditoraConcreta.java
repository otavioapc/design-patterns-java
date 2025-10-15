package observer_trabalho;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora{
	
	//Atributos
	
	private final List<Assinante> listaAssinantesEsporte = new ArrayList<>();
	private final List<Assinante> listaAssinantesPolitica = new ArrayList<>();
	private final List<Assinante> listaAssinantesFinanca = new ArrayList<>();
	
	
	//Métodos

	@Override
	public void assinarEditora(Assinante assinante, int assunto) {
		
		if(assunto == 1) {
			listaAssinantesEsporte.add(assinante);
			
		}
		else if(assunto == 2) {
			listaAssinantesPolitica.add(assinante);
			
		}
		else if(assunto == 3) {
			listaAssinantesFinanca.add(assinante);
			
		}
		
	}

	@Override
	public void cancelarEditora(Assinante assinante, int assunto) {
		
		if(assunto == 1) {
			listaAssinantesEsporte.remove(assinante);
			
		}
		else if(assunto == 2) {
			listaAssinantesPolitica.remove(assinante);
			
		}
		else if(assunto == 3) {
			listaAssinantesFinanca.remove(assinante);
			
		}
		
	}

	@Override
	public void notificarAssinantes(String mensagem, int assunto) {
		
		if(assunto == 1) {
			
			for(Assinante assinante : listaAssinantesEsporte) {
				assinante.publicar(mensagem);
			}
			
		}
		else if(assunto == 2) {
			
			for(Assinante assinante : listaAssinantesFinanca) {
				assinante.publicar(mensagem);
			}
			
		}
		else if(assunto == 3) {
			
			for(Assinante assinante : listaAssinantesPolitica) {
				assinante.publicar(mensagem);
			}
			
		}
		
	}

}
