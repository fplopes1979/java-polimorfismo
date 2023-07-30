package Casting;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo: Au au!");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo!");
    }
}
