import java.util.*;

public class atividade3List {
	public static void main(String[] args) {

		List<String> filmes = new ArrayList<>();

		// Lista de filmes
		filmes.add("O estranho mundo de jack");
		filmes.add("Coraline");
		filmes.add("A noiva cadáver");

		// Verificação
		System.out.println("Contém Coraline?: " + filmes.contains("Coraline"));

		//Parte 2: Verificando adição e remoção

		//Adição

		List<String> novosfilmes = Arrays.asList("Frankenweenie");
		filmes.addAll(novosfilmes);

		// Remoção
		filmes.remove("A noiva cadáver");

		// Lista de filmes
		System.out.println("Lista de filmes: " + filmes);
	}
}