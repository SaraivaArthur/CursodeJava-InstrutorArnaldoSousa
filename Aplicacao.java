public class Aplicacao {
	public static void main(String[] args) {
		// Testando o construtor padrão
		Carro carro1 = new Carro();
		carro1.exibirDetalhes();
		// Testando o construtor com dois parâmetros
		Carro carro2 = new Carro("Toyota", "Corolla");
		carro2.exibirDetalhes();
		// Testando o construtor com três parâmetros
		Carro carro3 = new Carro("Honda", "Civic", 2020);
		carro3.exibirDetalhes();
	}
}