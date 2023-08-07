package screenmatch;

public class Title {
    private String name;
    private int yearLaunch;
    private int durationMinutes;
    private boolean includedPlan = false;
    private double somaDasAvaliacoes;
    private double totalDeAvaliacoes;

    public Title() {
    }

    void showTitleDatas() {
        System.out.println("Nome do Título: " + this.name);
        System.out.println("Ano de lançamento: " + this.yearLaunch);
        System.out.println("Duração do título [min]: " + this.durationMinutes);
        System.out.println("Título está incluso no plano? " + this.includedPlan);
        System.out.println("Total de avaliações = " + this.totalDeAvaliacoes);
        System.out.println(String.format("Média das avaliações do filme = %.2f", this.somaDasAvaliacoes / this.totalDeAvaliacoes));
        System.out.println("**********************************************************************************");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearLaunch() {
        return this.yearLaunch;
    }

    public void setYearLaunch(int yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public int getDurationMinutes() {
        return this.durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public boolean isIncludedPlan() {
        return this.includedPlan;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    void evaluateTitle(double nota) {
        this.somaDasAvaliacoes += nota;
        ++this.totalDeAvaliacoes;
    }

    double takeMediaAssessmentsTitle() {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
}
