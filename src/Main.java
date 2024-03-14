public class Main {
    public static void main(String[] args) {
        Album AlbumPagode = new Album("Pagodinho da massa", 2002, "Pagodin");
        Musica musica1 = new Musica("Pagode do mal");
        Musica musica2 = new Musica("Pagode do bem");
        Musica musica3 = new Musica("Pagode da massa");
        Musica musica4 = new Musica("Pagode dos loucos");
        Musica musica5 = new Musica("Pagode do pagode");
        AlbumPagode.addMusicas(musica1);
        AlbumPagode.addMusicas(musica2);
        AlbumPagode.addMusicas(musica3);
        AlbumPagode.addMusicas(musica4);
        AlbumPagode.addMusicas(musica5);
    }
}

