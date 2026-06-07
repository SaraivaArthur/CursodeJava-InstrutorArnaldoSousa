class Personagem {
    String nome;
    int nivelDePoder;

    Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    // Método que tenta modificar um valor primitivo
    public void tentarAumentarNivelDePoder(int nivelDePoder) {
        nivelDePoder += 10;
    }

    // Método que modifica um objeto
    public void mudarNome(Personagem personagem) {
        personagem.nome = "Guerreiro";
    }

    // Método que realmente aumenta o nível de poder do personagem
    public void aumentarNivelDePoder() {
        this.nivelDePoder += 10;
    }
}

public class PassagemParametrosRPG {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Mago", 50);

        System.out.println("Antes de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.tentarAumentarNivelDePoder(heroi.nivelDePoder);
        System.out.println("Depois de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);

        System.out.println("Antes de mudarNome: " + heroi.nome);
        heroi.mudarNome(heroi);
        System.out.println("Depois de mudarNome: " + heroi.nome);

        System.out.println("Antes de aumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.aumentarNivelDePoder();
        System.out.println("Depois de aumentarNivelDePoder: " + heroi.nivelDePoder);
    }
}