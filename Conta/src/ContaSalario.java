
public class ContaSalario extends Conta {

    /**
     * Javadoc
     * @param agencia 
     * @param numeroConta 
     * @param saldo 
     */
    public ContaSalario(Agencia agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    /**
     * Definição de parametro para construtor
     * @param valor 
     * @throws ContaException 
     */
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

   
}
