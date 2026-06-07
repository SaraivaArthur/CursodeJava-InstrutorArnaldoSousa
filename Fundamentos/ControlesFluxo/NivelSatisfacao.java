public class NivelSatisfacao {
    public static void main(String[] args) {
        // Suponha que o usuário forneceu o número 3 para representar "Neutro"
        int nivel = 3;

        String feedback;

        switch (nivel) {
            case 1 -> feedback = "Muito insatisfeito";
            case 2 -> feedback = "Insatisfeito";
            case 3 -> feedback = "Neutro";
            case 4 -> feedback = "Satisfeito";
            case 5 -> feedback = "Muito satisfeito";
            default -> feedback = "Opção inválida (deve estar entre 1 e 5)";
        }

        System.out.println("Nível de satisfação: " + feedback);
    }
}