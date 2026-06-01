public class aprovadoOuNao {
	public static void main(String[] args) {
		int nota1 = 7;
		int nota2 = 10;
		int frequencia = 80;

		double media = (nota1 + nota2) / 2.0;

		if (media >= 7 && frequencia > 75) {
			System.out.println("Você foi aprovado!");
		} else {
			System.out.println("Você foi reprovado!");
		}

	}
}

