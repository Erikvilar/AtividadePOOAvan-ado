public class ClienteFisico extends Cliente {
    public ClienteFisico(String nome) {
        super(nome, "PessoaFisica");
    }

    @Override
    public void aplicarDesconto() {
        System.out.println("Aplicando desconto de 10% para Cliente Física.");
    }
}


