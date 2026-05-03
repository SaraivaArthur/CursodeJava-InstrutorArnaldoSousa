abstract class Loja {
	
	// aqui tem a definição dos atributos
	String cnpj;
	String razaoSocial;
	String aberta;

	Loja(String cnpj, String razaoSocial, String aberta) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = aberta;
	}

	// método para abrir a loja
	void abrirLoja() {
		System.out.println("Abrindo loja...");
	}

	// método para fechar a loja
	void fecharLoja() {
		System.out.println("Fechando loja...");
	}
}

// classe filha que estende a classe abstrata Loja
class LojaComercial extends Loja {
	LojaComercial(String cnpj, String razaoSocial, String aberta) {
		super(cnpj, razaoSocial, aberta);
	}
}

// classe principal
class atividade2Abstract {
	public static void main(String[] args) {
		LojaComercial loja = new LojaComercial(
			"22.743.493.0002-13",
            "Floricultura Amélia",
            "Sim"
		);

		loja.abrirLoja();
		loja.fecharLoja();

		System.out.println("CNPJ: " + loja.cnpj);
		System.out.println("Razao-Social: " + loja.razaoSocial);
		System.out.println("Aberta/Não: " + loja.aberta);

	}
}