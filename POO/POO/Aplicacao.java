public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A, 123", "1234-5678");

        // Acessando e modificando atributos
        System.out.println("Nome: " + pessoa.nome); // Acesso direto (public)

        System.out.println("Idade: " + pessoa.getIdade()); // Acesso via método (private)
        pessoa.setIdade(31);
        System.out.println("Nova Idade: " + pessoa.getIdade());

        System.out.println("Endereço: " + pessoa.getEndereco()); // Acesso via método (protected)
        pessoa.setEndereco("Rua B, 456");
        System.out.println("Novo Endereço: " + pessoa.getEndereco());

        System.out.println("Telefone: " + pessoa.getTelefone()); // Acesso via método (default)
        pessoa.setTelefone("8765-4321");
        System.out.println("Novo Telefone: " + pessoa.getTelefone());
    }
}