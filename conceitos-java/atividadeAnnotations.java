class SuperClasse {
	public void imprime() {
		System.out.println("Imprime");
	}
}


class MinhaClasse extends SuperClasse {
	@Override
	public void imprime() {
		System.out.println("Imprime diferente");
	}
}	

public class atividadeAnnotations {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
		minhaClasse.imprime();
    }
}