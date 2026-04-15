public class Atividade {
	public static void main(String[] args) {
		var numero = 10.5; // interferencia int
		double numeroCPF = numero * 2;  //var nao é reservado

/*
Não da pra começar uma variável com números, traços "-" e class
*/

		System.out.println("Valor de numero = " + numeroCPF);
	}
}

// este é um comentário de linha única


/*

Este é um comentário 
de várias linhas
*/

/**
 * Este e um comentário Javadoc, usado para criar API's
*/