public class ClienteJuridico extends Cliente {
    public ClienteJuridico(String nome) {
        super(nome, "PessoaJuridica");
    }

    @Override
    public void aplicarDesconto() {
        System.out.println("Aplicando desconto de 15% para Cliente Jurídica.");
    }
}