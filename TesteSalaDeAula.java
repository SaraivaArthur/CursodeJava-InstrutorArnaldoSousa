class SalaDeAula {
    static int contagem = 0;

    public SalaDeAula() {
        contagem++;
    }
}

public class TesteSalaDeAula  {
    public static void main(String[] args) {

        SalaDeAula c1 = new SalaDeAula();

        SalaDeAula c2 = new SalaDeAula();
        
        SalaDeAula c3 = new SalaDeAula();

        System.out.println("Número total de alunos: " + SalaDeAula.contagem);
    }
}