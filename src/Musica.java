public class Musica {
    private String titulo;
    private String duracao;
    private String compositor;

    public Musica(String titulo, String duracao, String compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void TocarMusica() {
        System.out.println("Tocando " + this.titulo + " de " + this.compositor + " com duração " + this.duracao);
    }


    public String getCompositor() {
        return compositor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }
}