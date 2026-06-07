public class SalaDeAula {
    // Variável estática para contar o número total de alunos
    static int totalAlunos = 0;

    // Método estático para adicionar alunos
    public static void adicionarAluno() {
        totalAlunos++;
    }

    // Método estático para exibir o número total de alunos
    public static void exibirTotalAlunos() {
        System.out.println("Total de alunos na sala: " + totalAlunos);
    }
}

public class TesteSalaDeAula {
    public static void main(String[] args) {
        // Criando instâncias da classe SalaDeAula
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();

        // Adicionando alunos
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();

        // Exibindo o número total de alunos
        SalaDeAula.exibirTotalAlunos();
    }
}