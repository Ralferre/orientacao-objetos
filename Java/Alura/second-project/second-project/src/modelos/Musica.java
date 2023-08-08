package modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String compositor;
    private int anoDeLancamento;
    private String genero;

    public Musica() {
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return this.compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int classificar() {
        if (this.getTotalReproducoes() > 1000) {
            return 10;
        } else if (this.getTotalReproducoes() >= 800) {
            return 8;
        } else if (this.getTotalReproducoes() >= 600) {
            return 6;
        } else if (this.getTotalReproducoes() >= 400) {
            return 4;
        } else {
            return 2;
        }


//        if (this.getTotalReproducoes() >= 500) {
//            return 9;
//        } else if (this.getTotalReproducoes() >= 300) {
//            return 7;
//        } else {
//            //return this.getTotalReproducoes() < 300 ? 5 : 3;
//            return 5;
//        }
    }
}
