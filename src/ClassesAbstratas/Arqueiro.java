package ClassesAbstratas;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int pontosDeVida, int pontosDeAtaque) {
        super(nome, pontosDeVida, pontosDeAtaque);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou a habilidade Disparo Preciso!");
    }
}
