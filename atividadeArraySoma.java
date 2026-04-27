public class atividadeArraySoma {
	public static void main(String[] args) {	
		int[] numeros = new int[1000];
		long soma = 0; // utilizamos o long pela preocupação do tamanho do número

		// aqui ele preenche a array de 1 até mil
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		// aqui ele calcula a soma de todos os elementos da array
		for (int num : numeros) {
			soma += num;
		}

		System.out.println("A soma dos números de 1 até 1000 é: " + soma);
	}
	
}