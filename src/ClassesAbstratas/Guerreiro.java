package ClassesAbstratas;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int pontosDeVida, int pontosDeAtaque) {
        super(nome, pontosDeVida, pontosDeAtaque);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou a habilidade Golpe Poderoso!");
    }
}
