public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Abril"; // Altere o valor para testar diferentes meses

        int numeroDeDias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto",
                 "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28; // Considerando um ano não bissexto
            default -> -1; // Valor inválido para mês desconhecido
        };

        if (numeroDeDias != -1) {
            System.out.println("Número de dias em " + mes + ": " + numeroDeDias);
        } else {
            System.out.println("Mês desconhecido.");
        }
    }
}