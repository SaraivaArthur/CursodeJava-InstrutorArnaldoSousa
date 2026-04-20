class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;
    // Construtor padrão
    public Carro() {
        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }
    // Construtor com dois parâmetros
    public Carro(String marca, String modelo) {
        marcaDoCarro = marca;
        modeloDoCarro = modelo;
        anoDoCarro = 0; // Valor padrão para ano
    }
    // Construtor com três parâmetros
    public Carro(String marca, String modelo, int ano) {
        marcaDoCarro = marca;
        modeloDoCarro = modelo;
        anoDoCarro = ano;
    }
    // Método para exibir os detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println("---------------------------"); // Pula uma linha para mostrar o próximo carro
    }
}