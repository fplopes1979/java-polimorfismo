package ClassesAbstratas;

public abstract class Personagem {

    private String nome;
    private int pontosDeVida;
    private int pontosDeAtaque;

    public Personagem(String nome, int pontosDeVida, int pontosDeAtaque) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeAtaque = pontosDeAtaque;
    }

    // Método abstrato que será implementado nas classes concretas
    public abstract void usarHabilidadeEspecial();

    // Método concreto que pode ser compartilhado entre todas as subclasses
    public void atacar(Personagem alvo) {
        System.out.println(nome + " está atacando " + alvo.getNome() + "!");
        alvo.receberDano(pontosDeAtaque);
    }

    public void receberDano(int pontosDeDano) {
        pontosDeVida -= pontosDeDano;
        System.out.println(nome + " sofreu " + pontosDeDano + " pontos de dano!");
        if (pontosDeVida <= 0) {
            System.out.println(nome + " foi derrotado!");
        }
    }

    public String getNome() {
        return nome;
    }
}
