public class diasSemana {
	public static void main(String[] args) {
		String dia = "Sabado";

		String tipoDeDia = switch (dia) {
			case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia útil";
			case "Sabado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido!";
		};

		System.out.println(tipoDeDia);
	}
}