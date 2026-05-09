class Cesto<conteudo> {
    private conteudo peixesNoCesto;

    public void guardar(conteudo coisa) { // método para guardar.
        this.peixesNoCesto = coisa;
        System.out.println("Guardado no cesto!");
    }

    public conteudo pegar() { // metodo para pegar
        System.out.println("Retirado do cesto!");
        return peixesNoCesto;
    }
}

class Peixe { // aqui determino duas informações, nome e tamanho.
    private String nome;
    private int tamanho;

    Peixe(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    String getNomePeixe() {
        return nome;
    }

    int getTamanho() {
        return tamanho;
    }
}

class Polvo { // aqui determino duas informações, nome e tentáculos.
    private String nome;
    private int tentaculos;

    Polvo(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    String getNome() {
        return nome;
    }

    int getTentaculos() {
        return tentaculos;
    }
}

class atividade1Generics { // classe main.
    public static void main(String[] args) {

        Cesto<Peixe> cestoPeixe = new Cesto<>(); // aqui eu crio os objetos do tipo cesto.
        Cesto<Polvo> cestoPolvo = new Cesto<>();

        Peixe peixe = new Peixe ("baiacu", 50); // aqui é onde eu determino os valores.
        Polvo polvo = new Polvo ("Octopus vulgaris", 8);

        System.out.println("Nome do peixe: " + peixe.getNomePeixe()); // para imprimir o nome.
        System.out.println("Tamanho do peixe: " + peixe.getTamanho()); // para imprimir o tamanho.

        cestoPeixe.guardar(peixe);
        cestoPeixe.pegar();

        System.out.println("-----------------------"); // apenas para separar as informações.

        System.out.println("Nome do polvo: " + polvo.getNome()); // para imprimir o nome.
        System.out.println("Tentáculos do polvo: " + polvo.getTentaculos()); // para imprimir o número de tentáculos.

        cestoPolvo.guardar(polvo); // aqui eu determino se vou pegar ou guardar.
        cestoPolvo.pegar(); 
    }
}
