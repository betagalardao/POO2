import java.util.List;

public class LojaOnline{
    //subsistemas 
    private CarrinhoDeCompras carrinho;
    private Estoque estoque;
    private Pagamento pagamento;
    private Entrega entrega;

    public LojaOnline(){
        //contrutor
        carrinho = new CarrinhoDeCompras();
        estoque = new Estoque();
        pagamento = new Pagamento();
        entrega = new Entrega();
    }

public void realizarCompra(List<String> itens, String metodoPagamento, String endereco){
        System.out.println("\n🛒 Iniciando processo de compra...");

        //adicionar os itens no carrinho
        for (String item : itens) {
            carrinho.adicionarItem(item);
        }

        //ver o estoque
        List<String> itensDoCarrinho = carrinho.getItens();
        if (!estoque.verificarDisponibilidade(itensDoCarrinho)) {
            System.out.println("❌ Compra cancelada: itens fora de estoque.");
            return;
        }

        //pagamento
        if (!pagamento.processarPagamento(metodoPagamento)) {
            System.out.println("❌ Compra cancelada: falha no pagamento.");
            return;
        }

        //calcula o frete e gera rastreamento
        double frete = entrega.calcularFrete(endereco);
        String codigo = entrega.gerarCodigoRastreamento();

        System.out.println("✅ Compra realizada com sucesso!");
        System.out.println("📦 Frete: R$ " + frete);
        System.out.println("🔎 Código de rastreamento: " + codigo);
    }
}