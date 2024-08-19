public abstract class Conta { 
    private Agencia agencia;
    private String numeroConta;
    protected double saldo;

    public abstract void saque(double valor) throws ContaException;
        
    public Conta(Agencia agencia, String numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
 
    public void deposito(double valor) throws ContaException {
        if (valor > 0) {
           this.saldo += valor;
        } else {
           throw new ContaException("Valor inválido para depósito "+valor);
        }
     }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}