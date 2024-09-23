import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("João", "joao@email.com");
        Artista artista = new Artista("The Beatles", "Rock");
        Musica musica1 = new Musica("Let It Be", 240, artista);
        Musica musica2 = new Musica("Hey Jude", 260, artista);
        artista.adicionarMusica(musica1);
        artista.adicionarMusica(musica2);

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Playlist");
            System.out.println("2. Adicionar Música à Playlist");
            System.out.println("3. Seguir Artista");
            System.out.println("4. Reproduzir Música");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (escolha) {
                case 1:
                    System.out.println("Digite o título da playlist:");
                    String titulo = scanner.nextLine();
                    usuario.criarPlaylist(titulo);
                    System.out.println("Playlist criada!");
                    break;
                case 2:
                    System.out.println("Música adicionada à playlist!");
                    // Implementar a adição de música à playlist aqui
                    break;
                case 3:
                    usuario.seguirArtista(artista);
                    System.out.println("Você está seguindo " + artista.getNome());
                    break;
                case 4:
                    usuario.reproduzirMusica(musica1);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
