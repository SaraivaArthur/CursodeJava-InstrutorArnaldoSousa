public class atividade1Exceptions {
	public static void main(String[] args) {

		Integer numero = null; // declara que o "número" existe, mas não tem nada dentro

		try { // aqui eu fiz o try
			String texto = numero.toString(); // aqui ele transforma: 10 : "10"
			System.out.println(texto);
		}	

		catch (NullPointerException e) { // aqui eu fiz o catch e guardei o erro que quero tratar
			System.out.println("Erro: ocorreu um NullPointerException.");
		}
	}
}