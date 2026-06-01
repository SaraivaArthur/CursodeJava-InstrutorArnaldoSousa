public class primeiroContatoPOO {

	int quantidadeAcucar;

	public static void main(String[] args) {

		primeiroContatoPOO boloDeChocolate = new primeiroContatoPOO();

		boloDeChocolate.quantidadeAcucar = 200;

		primeiroContatoPOO boloDeBaunilha = new primeiroContatoPOO();

		boloDeBaunilha.quantidadeAcucar = 150;

		System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);

		System.out.println("Quantidade de açucar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);


	}
}