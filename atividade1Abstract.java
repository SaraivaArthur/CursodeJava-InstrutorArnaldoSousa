abstract class FiguraGeometrica {

	// aqui tem a definição dos atributos base e altura
	int base;
	int altura;

	FiguraGeometrica(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	// método calcular área
	int calcularArea() {
		return base * altura;
	}

	// método calcular perímetro
	abstract void calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {

	Retangulo(int base, int altura) {
		super(base, altura);
	}

	@Override
	void calcularPerimetro() {
		int perimetro = 2 * (base + altura);
		System.out.println("Perímetro: " + perimetro);
	}
}

// classe principal
class atividade1Abstract {
	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(10, 10);

		System.out.println("Área: " + retangulo.calcularArea());
		retangulo.calcularPerimetro();
	}
}