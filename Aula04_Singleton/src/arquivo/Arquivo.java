package arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Arquivo {
	
	//Atributos

	private File arquivo;
	private static Arquivo arqSigleton;
	
	//Construtor

	private Arquivo() {

		arquivo = new File("txt/Teste.txt");

		if (!arquivo.exists()) {
			try {
				this.arquivo.createNewFile();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	//Métodos

	public void gravaArquivo(String texto) {
		FileWriter fileW;
		BufferedWriter bufferW;

		try {
			fileW = new FileWriter(arquivo, true);
			bufferW = new BufferedWriter(fileW);

			bufferW.write(texto);
			bufferW.newLine();

			bufferW.close();
			fileW.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static Arquivo getInstancia() {

		if (arqSigleton == null) {
			arqSigleton = new Arquivo();

		}

		return arqSigleton;

	}

}