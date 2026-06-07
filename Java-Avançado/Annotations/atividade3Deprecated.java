class ExemploDepreciado {
	@Deprecated
	public void metodoObsoleto() {
		System.out.println("criado!");
	}
}

public class atividade3Deprecated {
	@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado exemplodepreciado = new ExemploDepreciado();
		exemplodepreciado.metodoObsoleto();
    }
}