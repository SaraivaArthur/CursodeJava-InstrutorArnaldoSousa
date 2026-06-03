import java.util.Set;
import java.util.HashSet;
//import java.util.*;

public class atividade1Set {
	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<>();

		// Adicionando os números
		conjunto.add(10);
		conjunto.add(11);
		conjunto.add(12);

		// Verificação
		System.out.println("Contém 10? " + conjunto.contains(10)); // True

		// Adicionando mais números
		conjunto.add(13);
		conjunto.add(14);
		conjunto.add(15);

		// Removendo 
		conjunto.remove(14);

		// Imprimindo todos os números
		System.out.println("Conjunto de números: " + conjunto);
	}
}