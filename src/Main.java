public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 100.00);
        Produto produto2 = new Produto("Produto B", 250.00);

        produto1.aplicarImposto(10);
        produto1.aplicarTaxaAdicional(5);

        produto2.aplicarImposto(15);
        produto2.aplicarTaxaAdicional(8);

        System.out.println("Detalhes do " + produto1.getNome() + ":");
        System.out.println("Preço base: R$ " + produto1.getPrecoBase());
        System.out.println("Preço final: R$ " + produto1.calcularPrecoFinal());

        System.out.println("\nDetalhes do " + produto2.getNome() + ":");
        System.out.println("Preço base: R$ " + produto2.getPrecoBase());
        System.out.println("Preço final: R$ " + produto2.calcularPrecoFinal());
    }
}
