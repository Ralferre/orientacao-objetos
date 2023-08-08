package modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String tema;
    private int episodio;
    private String descricao;

    public Podcast() {
    }

    public String getApresentador() {
        return this.apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getEpisodio() {
        return this.episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int classificar() {
        if (this.getCurtidas() > 1000) {
            return 10;
        } else if (this.getCurtidas() >= 800) {
            return 8;
        } else if (this.getCurtidas() >= 600) {
            return 6;
        } else if (this.getCurtidas() >= 400) {
            return 4;
        } else {
            return 2;
        }
    }
}
