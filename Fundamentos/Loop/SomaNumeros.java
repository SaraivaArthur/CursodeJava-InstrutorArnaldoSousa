public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0; // Inicializa a variável soma com 0

        for (int i = 1; i <= 10; i++) {
            soma += i; // Soma o valor de i à variável soma
        }

        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}