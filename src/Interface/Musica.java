package Interface;

public class Musica implements Tocavel{

    private String titulo;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + titulo);
    }

    @Override
    public void resetar() {

    }
}
