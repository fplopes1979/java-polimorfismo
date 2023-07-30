package Casting;

public class App {
    public static void main(String[] args) {

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        // Conversão explícita de subtipo para supertipo
        Cachorro cachorro = (Cachorro) animal1;
        Gato gato = (Gato) animal2;

        // Chamando métodos específicos dos subtipos após a conversão
        cachorro.abanarRabo(); // Deve exibir "Cachorro abanando o rabo!"
        gato.arranhar();       // Deve exibir "Gato arranhando!"

        // Exemplo do uso do operador instanceof
        if (animal1 instanceof Cachorro) {
            System.out.println("animal1 é um Cachorro!");
        } else if (animal1 instanceof Gato) {
            System.out.println("animal1 é um Gato!");
        } else {
            System.out.println("animal1 não é nem um Cachorro nem um Gato!");
        }

        if (animal2 instanceof Cachorro) {
            System.out.println("animal2 é um Cachorro!");
        } else if (animal2 instanceof Gato) {
            System.out.println("animal2 é um Gato!");
        } else {
            System.out.println("animal2 não é nem um Cachorro nem um Gato!");
        }
    }
}

