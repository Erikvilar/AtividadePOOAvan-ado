public class ContaCorrente extends Conta implements Tarifavel {

   private double limiteChequeEspecial;
   //essa vai ser a variavel para a tarifa
   private double tarifa;
   /**
    * Anotação para documentar o Javadoc 
    * @param agencia 
    * @param numeroConta 
    * @param saldo 
    * @param limiteChequeEspecial 
    */
    
   public ContaCorrente(Agencia agencia, String numeroConta, double saldo, double limiteChequeEspecial) {
       super(agencia, numeroConta, saldo);
       this.limiteChequeEspecial = limiteChequeEspecial;
       this.tarifa = 0; 
   }

   @Override
   public void saque(double valor) throws ContaException {
       if (valor <= 0) {
           throw new ContaException("Valor inválido para saque " + valor);
       }
       if (this.getSaldo() + limiteChequeEspecial < valor) {
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
   
   public double getLimiteChequeEspecial() {
       return limiteChequeEspecial;
   }

   public void setLimiteChequeEspecial(double limiteChequeEspecial) {
       if (limiteChequeEspecial < 0) {
           throw new IllegalArgumentException("Limite de cheque especial não pode ser negativo.");
       }
       this.limiteChequeEspecial = limiteChequeEspecial;
   }
}

