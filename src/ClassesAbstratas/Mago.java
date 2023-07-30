package ClassesAbstratas;

public class Mago extends Personagem {

    public Mago(String nome, int pontosDeVida, int pontosDeAtaque) {
        super(nome, pontosDeVida, pontosDeAtaque);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou a habilidade Bola de Fogo!");
    }
}
