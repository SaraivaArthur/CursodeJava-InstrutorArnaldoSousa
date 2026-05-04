abstract class Operacao {
	public abstract double calcular(double a, double b); 
}

class Soma extends Operacao {
	@Override
	public double calcular(double a, double b) {
		return a + b;
	}
}

class Subtracao extends Operacao {
	@Override
	public double calcular(double a, double b) {
		return a - b;
	}
}

class Multiplicacao extends Operacao {
	@Override
	public double calcular(double a, double b) {
		return a * b;
	}
}

class Divisao extends Operacao {
	@Override
	public double calcular(double a, double b) {
		if (b == 0) {
			System.out.println("Não pode dividir por zero");
			return 0;
		}
		return a / b;
	}
}

class Calculadora {
	public static void main(String[] args) {
		Operacao operacaoSoma = new Soma(); // Objeto Polimórfico
 		System.out.println(operacaoSoma.calcular(10,10)); // Exibir resultado

 		Operacao operacaoSubtracao = new Subtracao(); // Objeto Polimórfico
 		System.out.println(operacaoSubtracao.calcular(10,5)); // Exibir resultado

 		Operacao operacaoMultiplicacao = new Multiplicacao(); // Objeto Polimórfico
 		System.out.println(operacaoMultiplicacao.calcular(10,2)); // Exibir resultado

 		Operacao operacaoDivisao = new Divisao(); // Objeto Polimórfico
 		System.out.println(operacaoDivisao.calcular(10,0)); // Exibir resultado
	}
}

