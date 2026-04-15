public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {

        int numero = 5;

        // Pré-incremento
        System.out.println("Pré-incremento: " + (++numero));

        // Pós-incremento
        System.out.println("Pós-incremento: " + (numero++));

        // Pré-decremento
        System.out.println("Pré-decremento: " + (--numero));

        // Pós-decremento
        System.out.println("Pós-decremento: " + (numero--));
    }
}