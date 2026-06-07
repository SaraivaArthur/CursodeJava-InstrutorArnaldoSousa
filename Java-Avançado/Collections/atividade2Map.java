import java.util.HashMap;
import java.util.Map;

public class atividade2Map {
	public static void main(String[] args) {

		Map<String, Integer> estoque = new HashMap<>();

		// Adicionando códigos e quantidades
		estoque.put("ACS", 50);
		estoque.put("PCH", 37);
		estoque.put("AXY", 15);

		// Verificação
		System.out.println("Contém quantos produtos do código ACS?: " + estoque.get("ACS"));

		// Remoção
		estoque.remove("PCH", 37);

		estoque.put("PCH", 67);

		System.out.println("Estoque: " + estoque);
	}
}