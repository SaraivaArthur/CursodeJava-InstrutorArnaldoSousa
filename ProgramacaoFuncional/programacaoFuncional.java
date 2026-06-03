@FunctionalInterface

interface OperacaoMatematica {
	double executar(double a, double b);
}

public class programacaoFuncional {
	public static void main(String[] args) {
		double base = 10;
		double expoente = 2;

		double resultadoPotencia = Math.pow(base, expoente);
		System.out.println("O resultado da potência é: " + resultadoPotencia);

		double resultadoRaiz = Math.sqrt(base);
		System.out.println("O resultado da raiz é: " + resultadoRaiz);
	}
}