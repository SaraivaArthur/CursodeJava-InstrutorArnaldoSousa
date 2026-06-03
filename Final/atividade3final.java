final class Veiculo {
	void ligarMotor() {
		System.out.println("Motor ligado");
	}
}

class atividade3final extends Veiculo {
	void ligarMotor() {}
}

// Não vai rodar porque o método veiculo é final.