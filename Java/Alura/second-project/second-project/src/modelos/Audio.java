package modelos;
public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public Audio() {
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public int getClassificacao() {
        return this.classificacao;
    }

    public void curtir() {
        ++this.curtidas;
    }

    public void reproduzir() {
        ++this.totalReproducoes;
    }

    public int classificar() {
        return this.classificacao * 100 / 10;
    }
}
