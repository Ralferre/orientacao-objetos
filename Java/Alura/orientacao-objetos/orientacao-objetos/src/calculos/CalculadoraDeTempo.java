package calculos;

import screenmatch.Title;

public class CalculadoraDeTempo {
    private double tempoTotal;

    public CalculadoraDeTempo() {
    }

    public double getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Title t) {
        this.tempoTotal = t.getDurationMinutes();
        int horas = 0;
        double minutos = 0;
        horas = (int) this.tempoTotal / 60;
        minutos = this.tempoTotal - horas;
        this.tempoTotal = horas + minutos;
        System.out.println(String.format("Mostrando tempo total para assistir %s, tempo total em [min]: %d", t.getName(), (int) this.tempoTotal));
        System.out.println(String.format("Mostrando tempo total para assistir %s, tempo total em [h]: %.2f", t.getName(), this.tempoTotal / 60));
        System.out.println("*************************************************************************");
    }

}
