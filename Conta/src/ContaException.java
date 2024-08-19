public class ContaPoupanca extends Conta implements Tarifavel {

    private double tarifa;

    public ContaPoupanca(Agencia agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
        this.tarifa = 0;
    }

    @Override
    public void saque(double valor) throws ContaException {
        if (valor <= 0) {
            throw new ContaException("Valor inválido para saque " + valor);
        }
        if (this.getSaldo() < valor) {
            throw new ContaException("Conta sem saldo suficiente: " + this.getSaldo());
        }
        this.setSaldo(this.getSaldo() - valor);
    }

    @Override
    public void setTarifa(double tarifa) {
        if (tarifa < 0) {
            throw new IllegalArgumentException("Tarifa não pode ser negativa.");
        }
        this.tarifa = tarifa;
    }

    @Override
    public void cobrarTarifa() throws ContaException {
        if (this.getSaldo() < tarifa) {
            throw new ContaException("Saldo insuficiente para cobrir a tarifa. Saldo atual: " + this.getSaldo());
        }
        this.setSaldo(this.getSaldo() - tarifa);
    }

    public void atualizarRendimento(Double taxaRendimento) {
        if (taxaRendimento == null || taxaRendimento < 0) {
            throw new IllegalArgumentException("Taxa de rendimento inválida: " + taxaRendimento);
        }
        this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
    }
}
