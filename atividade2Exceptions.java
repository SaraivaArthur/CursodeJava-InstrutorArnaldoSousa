public class atividade2Exceptions {

	public static int acessarElemento(int[] array, int indice) {
		try {
			return array[indice];

		} catch (ArrayIndexOutOfBoundsException e) { //aqui é o erro que queremos tratar caso o índice não exista, por exemplo o número 60

			System.out.println("Erro: Indice fora dos limites do array.");
			return -1;

		}
	}

	public static void main(String[] args) {

		int[] meuArray = {10, 20, 30, 40, 50}; // aqui eu declaro a ordem começando por zero

		System.out.println("Elemento no índice 2: " + acessarElemento(meuArray, 2)); // aqui eu busco dentro de "meuArray" o número dentro do índice, no caso o 30

		System.out.println("Elemento no índice 3: " + acessarElemento(meuArray, 3)); // aqui a mesma coisa mas o índice 40
	}
}