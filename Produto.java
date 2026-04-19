class Produto {   
    private String nome;
    private double preco;   
    private int quantidadeEmEstoque;   

// Este é o construtor  
    Produto (String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {  
		nome = nomeInit;  
		preco = precoInit;  
		quantidadeEmEstoque = quantidadeEmEstoqueInit;  
}

	public static void main(String[] args) {   
  
	Produto produto = new Produto("Strap", 12.00, 50);   
        System.out.println("Nome: " + produto.nome);   
        System.out.println("Preço: " + produto.preco);   
        System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);  
    }   
}