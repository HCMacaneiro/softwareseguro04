import java.util.ArrayList;

public class Album {
    private int ano;
    private String nome;
    private ArrayList<String> musicas;

    public Album(String genero, int ano, String nome, String artista) {
        this.ano = ano;
        this.nome = nome;
        this.musicas = new ArrayList<String>();
    }

    public void setMusicas(ArrayList<String> musicas) {
        this.musicas = musicas;
    }
}
