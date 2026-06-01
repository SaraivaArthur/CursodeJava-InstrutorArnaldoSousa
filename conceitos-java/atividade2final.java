class Calculadora {
 	final int somar(int a, int b) {
 		return a + b;
 	}
}

class CalculadoraCientifica extends Calculadora {
 // Tente descomentar o trecho abaixo para ver o erro:
 	//@Override
 	//int somar(int a, int b) {
 		//return a + b;
	//}
}

public class atividade2final {
 	public static void main(String[] args) {
 	Calculadora calculadora = new Calculadora();
 		System.out.println("Resultado: " + calculadora.somar(5, 3));
 	}
}
