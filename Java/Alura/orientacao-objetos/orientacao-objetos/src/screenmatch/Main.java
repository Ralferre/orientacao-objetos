package screenmatch;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        serie1.setName("Fauda");
        serie1.setYearLaunch(2020);
        serie1.setEpisodiosPorTemporada(23);
        serie1.setTemporadas(4);
        serie1.setMinutosPorEpisodio(43);
        serie1.evaluateTitle(8.9);
        serie1.evaluateTitle(7.6);
        serie1.showTitleDatas();

        Film film1 = new Film();
        film1.setName("O Justiceiro");
        film1.setYearLaunch(2015);
        film1.setDurationMinutes(93);
        film1.setDiretor("Tim Tonto");
        film1.evaluateTitle(10);
        film1.evaluateTitle(5);
        film1.showTitleDatas();

        Episodio episodio = new Episodio();
        episodio.setSerie(serie1);
        episodio.setNumero(1);
        episodio.setNome("Caçada ao terrorista");
        episodio.setTotalVisualizacoes(20);

        CalculadoraDeTempo calculaTempo = new CalculadoraDeTempo();
        calculaTempo.inclui(serie1);
        calculaTempo.inclui(film1);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(serie1);
        filtro.filtrar(film1);
        filtro.nomear(episodio);
        filtro.filtrar(episodio);

    }
}
