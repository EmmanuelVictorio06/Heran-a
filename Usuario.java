import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private String email;
    private List<Playlist> playlists;
    private List<Artista> artistasSeguidos;

    public Usuario(String nome, String email) {
        super(nome);
        this.email = email;
        this.playlists = new ArrayList<>();
        this.artistasSeguidos = new ArrayList<>();
    }

    public void criarPlaylist(String titulo) {
        playlists.add(new Playlist(titulo));
    }

    public void seguirArtista(Artista artista) {
        artistasSeguidos.add(artista);
    }

    public void reproduzirMusica(Musica musica) {
        musica.tocar();
    }
}
