public class Caixa<T> {
    private T[] elementos;

    public Caixa(int capacidade) {
        elementos = (T[]) new Object[capacidade];
    }

    public void adicionar(T elemento, int indice) {
        elementos[indice] = elemento;
    }

    public T obter(int indice) {
        return elementos[indice];
    }

    public static void main(String[] args) {
        // Criando uma CaixaDePreços para Double
        Caixa<Double> caixaDePrecos = new Caixa<>(3);
        caixaDePrecos.adicionar(10.5, 0);
        caixaDePrecos.adicionar(20.0, 1);

        System.out.println("Preço 1: " + caixaDePrecos.obter(0)); // Saída: 10.5
        System.out.println("Preço 2: " + caixaDePrecos.obter(1)); // Saída: 20.0

        // Criando uma CaixaDeLetras para Character
        Caixa<Character> caixaDeLetras = new Caixa<>(2);
        caixaDeLetras.adicionar('A', 0);
        caixaDeLetras.adicionar('B', 1);

        System.out.println("Letra 1: " + caixaDeLetras.obter(0)); // Saída: A
        System.out.println("Letra 2: " + caixaDeLetras.obter(1)); // Saída: B
    }
}