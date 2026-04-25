public class atividadeArray {
	public static void main(String[] args) {

		double[] numeros; // Declaração de Arrays

		numeros = new double[5]; // Criação do Array
		numeros[0] = 5.0;
		numeros[1]= 6.5;
		numeros[2]= 7.0;
		numeros[3]= 8.5;
		numeros[4]= 9.0;

		for (double elemento : numeros) {
        	System.out.println(elemento);
        }
    }
}