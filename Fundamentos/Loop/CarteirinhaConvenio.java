public class CarteirinhaConvenio {
    public static void main(String[] args) {
        // Variável código de saída que pode ser modificada pelo aluno
        int codigoDeSaida = 9; // O aluno pode modificar este valor conforme desejado

        // Laço que percorre códigos de carteirinha de 1 a 10
        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

            // Verifica se o codigoCarteirinha é igual ao codigoDeSaida definido pelo aluno
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Código de saída encontrado, interrompendo o loop.");
                break;
            }

            // Verifica se o codigoCarteirinha é aceito pelo hospital Santa Clara
            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("O código da carteirinha " + codigoCarteirinha
                        + " é aceito pelo hospital Santa Clara.");
                continue;
            }

            // Mensagem genérica para outros códigos de carteirinha
            System.out.println("O código da carteirinha " + codigoCarteirinha
                    + " não é aceito pelo hospital Santa Clara.");
        }
    }
}