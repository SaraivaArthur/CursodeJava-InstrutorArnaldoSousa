public class VerificacaoAprovacaoSimplificada {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 5;

        double media = (nota1 + nota2) / 2.0;

        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não aprovado.");
        }
    }
}