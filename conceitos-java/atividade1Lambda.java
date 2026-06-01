import java.util.HashSet;
import java.util.*;

public class atividade1Lambda {
	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5)); // criando uma lista de números

		numeros.removeIf(numero -> numero % 2 == 0); // removeIf remove elementos se a condição for verdadeira

		System.out.println(numeros); // imprime os números ímpares
	}
}
