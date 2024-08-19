import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numero;
    private List<Conta> contas = new ArrayList<>(); 

    public Agencia(String numero) {
      this.numero = numero;
    }

    public void addConta(Conta conta) {
      this.contas.add(conta);
    }

    public void saque(String numeroConta,double valor) throws ContaException {
       Conta conta = getConta(numeroConta);
       conta.saque(valor);    
    }

    public void deposito(String numeroConta,double valor) throws ContaException {
        Conta conta = getConta(numeroConta);
        conta.deposito(valor);
    }
    
    private Conta getConta(String numeroConta) throws ContaException {
       for (Conta conta: contas) {
          if (conta.getNumeroConta().equals(numeroConta)) {
             return conta;
          }
       }
       throw new ContaException("Numero da conta "+numeroConta+" não existe");
    }

}
     