class Veiculo {
    void acelerar() {
        System.out.println("Veículo acelerando!");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Carro acelerando!");
        super.acelerar(); // Chamando o método da superclasse
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.acelerar();
    }
}