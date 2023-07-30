package ClassesAbstratas;

public class App {
    public static void main(String[] args) {

        // Criando instâncias das classes concretas
        Guerreiro guerreiro = new Guerreiro("Conan", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 30);
        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 25);

        // Utilizando o método atacar da classe abstrata
        guerreiro.atacar(mago); // Conan está atacando Gandalf!
        mago.atacar(arqueiro);  // Gandalf está atacando Legolas!

        // Utilizando o método usarHabilidadeEspecial das classes concretas
        guerreiro.usarHabilidadeEspecial(); // Conan usou a habilidade Golpe Poderoso!
        mago.usarHabilidadeEspecial();      // Gandalf usou a habilidade Bola de Fogo!
        arqueiro.usarHabilidadeEspecial();  // Legolas usou a habilidade Disparo Preciso!
    }
}

