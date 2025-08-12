package desafios;
import java.io.FileWriter;
import java.io.IOException;

public class criararquivohtml {

	public static void main(String[] args) {
		String caminhoArquivo = "grafico.html";
		String conteudo = "Este é o conteúdo do arquivo de texto.";
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			writer.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao criar o arquivo: "+e.getMessage());
		}
	}
}

}
