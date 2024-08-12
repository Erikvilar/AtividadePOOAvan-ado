public class Produto {
    private String nome;
    private double precoBase;
    private double precoComImposto;
    private double precoFinal;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.precoComImposto = precoBase;
        this.precoFinal = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
        this.precoComImposto = precoBase;
        this.precoFinal = precoBase;
    }

    public void aplicarImposto(double percentualImposto) {
        double imposto = precoBase * (percentualImposto / 100);
        precoComImposto = precoBase + imposto;
    }

    public void aplicarTaxaAdicional(double percentualTaxa) {
        double taxaAdicional = precoComImposto * (percentualTaxa / 100);
        precoFinal = precoComImposto + taxaAdicional;
    }

    public double calcularPrecoFinal() {
        return precoFinal;
    }
}
