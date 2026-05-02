interface Veiculo {
    void iniciar(); // método abstrato
    void parar();

    default void buzinar() {
        System.out.println("Buzinando bibi");
    }
}

class Carro implements Veiculo {
    public void iniciar() {
        System.out.println("Carro iniciando...");
    }

    public void parar() {
        System.out.println("Carro parando...");
    }
}

class Caminhao implements Veiculo {
    public void iniciar() {
        System.out.println("Caminhão iniciando...");
    }

    public void parar() {
        System.out.println("Caminhão parando...");
    }
}

public class atividade1interfaces {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.iniciar(); // Deve imprimir "Carro iniciando...".
        carro.buzinar(); // Deve imprimir "Buzinando, bibi".

        System.out.println("----------------------------------");

        Caminhao caminhao = new Caminhao();
        caminhao.iniciar(); // Deve imprimir "Caminhão iniciando...".
        caminhao.buzinar(); // Deve imprimir "Buzinando, bibi".
    }
}