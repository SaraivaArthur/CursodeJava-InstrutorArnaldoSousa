import java.io.*;

public class ExemploIOExercicio {

    public static void main(String[] args) {

        try {

            String nomeArquivo = "meuArquivo.txt"; // nome do arquivo

            escreverNoArquivo(nomeArquivo, "Olá, mundo!"); // conteúdo do arquivo

            String texto = lerDoArquivo(nomeArquivo); // chama o método lerDoArquivo

            System.out.println(texto); // aqui ele imprime o conteúdo

        } catch (IOException e) { 

            System.out.println("Problemas de IO: " + e.getMessage()); // se der algum erro o catch aparece e diz qual o erro, por exemplo, "Arquivo não encontrado"
        }
    }

    public static void escreverNoArquivo(String nomeArquivo, String conteudo) throws IOException { // aqui determina o nome e o conteúdo

        FileWriter writer = new FileWriter(nomeArquivo); // aqui ele cria um objeto para escrever no arquivo, se não tiver, ele cria

        writer.write(conteudo);

        writer.close();
    }

    public static String lerDoArquivo(String nomeArquivo) throws IOException { 

        FileReader reader = new FileReader(nomeArquivo); // abre o arquivo

        String conteudo = ""; // aqui ele armazena o que foi lido

        int data = reader.read(); // aqui ele lê um caractere por vez

        while (data != -1) {

            conteudo += (char) data; // aqui ele converte para letras

            data = reader.read();
        }

        reader.close();

        return conteudo;
    }
}