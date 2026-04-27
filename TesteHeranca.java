class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }
}

class Assistente extends Funcionario {
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        Assistente a = new Assistente();

        a.setNome("João");
        a.setSalario(3000);
        a.addAumento(500);

        System.out.println(a.getNome());
        System.out.println(a.ganhoAnual());
    }
}