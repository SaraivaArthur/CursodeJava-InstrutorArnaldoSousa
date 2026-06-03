public class impressaoDiasSemana {
	public static void main(String[] args) {
		
		int diaDaSemana = 3;

		switch (diaDaSemana) {
			case 1:
				System.out.println("Seg.");
				break;


			case 2:
				System.out.println("Ter.");
				break;


			case 3:
				System.out.println("Quar.");
				break;

			case 4:
				System.out.println("Quin.");
				break;

			case 5:
				System.out.println("Sex.");
				break;

		    default:
				System.out.println("Dia desconhecido!");
		}
	}
}
