package Interface;

public class App {
    public static void main(String[] args) {


        Tocavel tocavel1 = new Musica("Imagine - John Lennon");
        Tocavel tocavel2 = new Video("Java for Beginners");

        tocavel1.tocar(); // Deve exibir "Tocando música: Imagine - John Lennon"
        tocavel2.tocar(); // Deve exibir "Tocando vídeo: Java for Beginners"
    }
}
