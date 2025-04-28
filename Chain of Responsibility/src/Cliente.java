public class Cliente {
    //dados para a analise de crédito
    public double rendaMensal;
    public double valorParcela;
    public boolean possuiRestricao;
    public boolean possuiGarantia;
    public boolean creditoDisponivel;

    //construtor do objeto
    public Cliente(double renda, double parcela, boolean restricao, boolean garantia, boolean creditoDisp) {
        this.rendaMensal = renda;
        this.valorParcela = parcela;
        this.possuiRestricao = restricao;
        this.possuiGarantia = garantia;
        this.creditoDisponivel = creditoDisp;
    }
}
