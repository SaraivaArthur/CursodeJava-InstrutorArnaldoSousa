import java.io.*;

public class AtividadeIO {
    public static void main(String[] args) {

        try {
            String nomeArquivo = "meuArquivo.txt"; // nome do arquivo

            EscreverNoArquivo(nomeArquivo, "Olá, mundo! Me chamo Arthur"); // conteúdo do arquivo

            String texto = LerDoArquivo(nomeArquivo);

            System.out.println(texto);

        } catch (IOException e) {
            System.out.println("Problema de IO: " + e.getMessage());
        }
    }

    public static void EscreverNoArquivo(String nomeArquivo, String conteudo) throws IOException { // aqui determinamos o nome e o contéudo do arquivo

        FileWriter writer = new FileWriter(nomeArquivo); // aqui ele busca o arquivo

            writer.write(conteudo); // aqui ele grava os dados

            writer.close(); // aqui ele fecha
    }

    public static String LerDoArquivo(String nomeArquivo) throws IOException {

        // Lendo de um arquivo
        FileReader reader = new FileReader(nomeArquivo); // aqui ele lê o arquivo

        String conteudo = ""; // aqui ele guarda o que foi lido

        int data = reader.read(); // aqui faz ele ler um caracter por vez

        while (data != -1) {

            conteudo += (char) data; // converte o número lido para caractere

            data = reader.read();

        }

        reader.close();

        return conteudo;
    }
}