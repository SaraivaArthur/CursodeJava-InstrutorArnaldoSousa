class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, int idade, int matricula) {
        super(nome, idade); // Chama o construtor da classe pai
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}

public class Principal {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", 20, 12345);

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
    }
}