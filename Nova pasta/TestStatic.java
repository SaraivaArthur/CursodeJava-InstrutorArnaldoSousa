class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arnaldo", 5000.00); // para determinar double sem usar "10.2" por exemplo, pode ser usado "10d"
		funcionario.aumentarSalario(100);

        System.out.println(funcionario.obterInfo());
    }
}