package Interface;

public class Video implements Tocavel{

    private String titulo;
    public Video(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando vídeo: " + titulo);
    }

    @Override
    public void resetar() {

    }

}
