//final class FinalVariables { esse final invalidaria o código, o ignoraria
class FinalVariables {
	final int $NUMERO_MAXIMO = 100;

	final void mensagem () {
		System.out.println("Bem-vindo ao mundo da programação!");
	}
}

public class atividadedeFinal extends FinalVariables {

	public static void main(String[] args) {
        FinalVariables finalVariables = new FinalVariables();

        finalVariables.mensagem();
	}
}