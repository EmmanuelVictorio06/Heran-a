import java.util.ArrayList;
import java.util.List;

public class Artista extends Pessoa {
    private String generoMusical;
    private List<Musica> musicas;

    public Artista(String nome, String generoMusical) {
        super(nome);
        this.generoMusical = generoMusical;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
}
