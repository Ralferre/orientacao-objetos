package calculos;

public class FiltroRecomendacao {
    public FiltroRecomendacao() {
    }

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("*************************************************************************");
            System.out.println("Está entre os preferidos no momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("*************************************************************************");
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("*************************************************************************");
            System.out.println("Coloque na sua lista para assistir depois!");
        }

    }

    public void nomear(Classificavel classificavel) {
        System.out.println("Nome capturado é: " + classificavel.pegaNome());
    }
}
