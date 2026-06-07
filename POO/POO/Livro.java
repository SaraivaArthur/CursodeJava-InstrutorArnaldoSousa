class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco; // Modificador default

    // Construtor padrão
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    // Construtor com dois parâmetros
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0; // Valor padrão para anoPublicacao
        this.preco = 0.0; // Valor padrão para preco
    }

    // Construtor com quatro parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }
}

public class Aplicacao {
    public static void main(String[] args) {
        // Testando o construtor padrão
        Livro livro1 = new Livro();

        System.out.println("Título: " + livro1.titulo);
        // Não é possível acessar diretamente 'autor' pois é private
        // System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
        System.out.println("Preço: " + livro1.preco);

        // Testando o construtor com dois parâmetros
        Livro livro2 = new Livro("1984", "George Orwell");

        System.out.println("Título: " + livro2.titulo);
        // Não é possível acessar diretamente 'autor' pois é private
        // System.out.println("Autor: " + livro2.autor);
        System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
        System.out.println("Preço: " + livro2.preco);

        // Testando o construtor com quatro parâmetros
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 49.90);

        System.out.println("Título: " + livro3.titulo);
        // Não é possível acessar diretamente 'autor' pois é private
        // System.out.println("Autor: " + livro3.autor);
        System.out.println("Ano de Publicação: " + livro3.anoPublicacao);
        System.out.println("Preço: " + livro3.preco);
    }
}