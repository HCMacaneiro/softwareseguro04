import java.util.ArrayList;

public class Album {
    private int ano;
    private String nome;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista) {
        this.ano = ano;
        this.nome = nome;
        this.musicas = new ArrayList<Musica>();
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
