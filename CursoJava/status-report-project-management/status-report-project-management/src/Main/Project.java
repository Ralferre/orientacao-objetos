public abstract class Project {

    private int io;
    private String name;
    private double saldoAprovado;
    private double saldoDisponivel;
    private double compromisso;
    private double executado;
    private int execucao;
    public abstract void calcularCustos();
    public abstract void atualizarStatus();

    public int getIo() {
        return io;
    }

    public void setIo(int io) {
        this.io = io;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldoAprovado() {
        return saldoAprovado;
    }

    public void setSaldoAprovado(double saldoAprovado) {
        this.saldoAprovado = saldoAprovado;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(double compromisso) {
        this.compromisso = compromisso;
    }

    public double getExecutado() {
        return executado;
    }
    public int getExecucao() {
        return execucao;
    }

    public void setExecutado(double executado) {
        this.executado = executado;
    }



    public void setExecucao(int execucao) {
        this.execucao = execucao;
    }





}
