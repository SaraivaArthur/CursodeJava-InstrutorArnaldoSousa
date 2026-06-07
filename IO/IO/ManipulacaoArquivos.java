import java.nio.file.*;
import java.io.IOException;

public class ManipulacaoArquivos {

	public static void main(String[] args) {

   		Path path = Paths.get("atividadeNIO.txt");

    	try {

        	// Escrevendo em um arquivo
       		Files.write(path, "Olá, mundo! Este é um arquivo criado por um código NIO.".getBytes());

        	// Lendo de um arquivo

        	byte[] bytes = Files.readAllBytes(path);

        	String conteudoLido = new String(bytes);

        	System.out.println("Conteúdo lido do arquivo: " + conteudoLido);
 
    	} catch (IOException e) {

        	System.out.println("Problemas de IO: " + e.getMessage());
    	}
	}	
}

