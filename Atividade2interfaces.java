interface PedidoRestaurante {
	void adicionarItem(String item, double preco);
	double calcularTotal();
}

class Pedido implements PedidoRestaurante {
	private double total = 0;

	@Override
	public void adicionarItem(String item, double preco) {
		System.out.println("Adicionando " + item + " (R$" + preco + ") ao pedido.");
		total += preco;
	}

	@Override
	public double calcularTotal() {
		return total;
	}

	public static void main(String[] args) {
		PedidoRestaurante pedido = new Pedido();
			pedido.adicionarItem("Hambúrguer", 15.0);
			pedido.adicionarItem("Batata Frita", 8.0);
			pedido.adicionarItem("Refrigerante", 4.0);

			System.out.println("Valor total do pedido: R$" + pedido.calcularTotal());
	}
}