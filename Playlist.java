import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String titulo;
    private List<Musica> musicas;

    public Playlist(String titulo) {
        this.titulo = titulo;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarPlaylist() {
        for (Musica musica : musicas) {
            musica.tocar();
        }
    }
}
