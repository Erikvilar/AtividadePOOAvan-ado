public class App {
    public static void main(String[] args) {
        try {
            Agencia caixaLuizote = new Agencia("0205-08");
            ContaCorrente contaCorrente = new ContaCorrente(caixaLuizote, "1164-9", 500d, 1000d);
            ContaPoupanca contaPoupanca = new ContaPoupanca(caixaLuizote, "1324-9", 700d);
            caixaLuizote.addConta(contaPoupanca);
            caixaLuizote.addConta(contaCorrente);
            contaCorrente.setTarifa(10.0);
            System.out.println("Saque 1200 da Conta Corrente");
            caixaLuizote.saque("1164-9", 1200); 
            System.out.println("saque 1000 da Conta Poupança");
            caixaLuizote.saque("1324-9", 1000);
        } catch (ContaException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
