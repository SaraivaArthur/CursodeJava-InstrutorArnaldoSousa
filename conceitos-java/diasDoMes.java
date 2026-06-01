public class diasDoMes {
	public static void main(String[] args) {
		String mes = "Fevereiro";

		switch (mes) {

			case "Janeiro":
			case "Março":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubro":
			case "Dezembro":
				System.out.println("31 dias");
				break;

			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("30 dias");
				break;

			case "Fevereiro":
				System.out.println("28 dias");
				break;

			default:
				System.out.println("Mês desconhecido");
		}
	}
}