package screenmatch;

import calculos.Classificavel;

public class Film extends Title implements Classificavel {
    private String diretor;

    public Film() {
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return (int)this.takeMediaAssessmentsTitle() / 2;
    }

    public String pegaNome() {
        return this.getName();
    }
}
