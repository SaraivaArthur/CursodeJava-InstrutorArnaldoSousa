import java.util.*;

public class atividade2Lambda {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>(Arrays.asList("Uva", "Maçã", "Banana", "Cereja", "Abacaxi")); // aqui ele cria uma lista de frutas

		lista.removeIf(s -> s.length() > 7); // aqui diz que palavras com até 7 letras serão exibidas

		//lista.add(0, "Uva"); // aqui ele determina esse item como índice zero, ou seja, o primeiro

		lista.forEach(System.out::println); // o foreach percorre cada elemento
	}
}