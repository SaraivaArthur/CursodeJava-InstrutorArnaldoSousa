public class MinhaClasse {
 	public int calcularSoma(int a, int b) {
 		return a + b;
 	}

 	@Deprecated
 	public int calcularProduto(int a, int b) {
 		return a * b;
 	}
}

public class atividadeAnnotations2 {
 	public static void main(String[] args) {
 		MinhaClasse minhaClasse = new MinhaClasse();
 		int resultadoSoma = minhaClasse.calcularSoma(5, 3);
 		int resultadoProduto = minhaClasse.calcularProduto(5, 3);
 		
 		System.out.println("Soma: " + resultadoSoma);
 		System.out.println("Produto: " + resultadoProduto);
	}
}
