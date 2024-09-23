public class Musica {
    private String titulo;
    private int duracao; // Duração em segundos
    private Artista artista;

    public Musica(String titulo, int duracao, Artista artista) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
    }

    public void tocar() {
        System.out.println("Tocando: " + titulo + " por " + artista.getNome());
    }
}
