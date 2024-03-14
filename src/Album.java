import java.util.ArrayList;

public class Album {
    private int ano;
    private String nome;
    private ArrayList<Musica> musicas;

    public Album(String nome, int ano, String artista) {
        this.ano = ano;
        this.nome = nome;
        this.musicas = new ArrayList<Musica>();
    }

    public void addMusicas(Musica musica) {
        this.musicas.add(musica);
    }
}
