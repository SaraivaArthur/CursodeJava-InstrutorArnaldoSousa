public class VerificacaoAprovacaoNotasPresenca {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 6;
        int frequencia = 80;

        double media = (nota1 + nota2) / 2.0;
        boolean aprovado = media >= 7 && frequencia >= 75;

        if (aprovado) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não aprovado.");
        }
    }
}