import java.util.Arrays;
import java.util.List;

public class Estoque{

    //outra lista para guardar os produtos disponiveis
    private List<String> produtosDisponiveis;

    //produtos que existem no estoque
    public Estoque(){
        this.produtosDisponiveis = Arrays.asList("Blush", "Base", "Gloss", "Batom");
    }

    public boolean verificarDisponibilidade(List<String> itensDoCarrinho) {
        for (String item : itensDoCarrinho) {
            //se o produto não estiver no estoque, então retorna falso (!)
            if (!produtosDisponiveis.contains(item)) {
                System.out.println("Produto fora de estoque: " + item);
                return false;
            }
        }
        return true;
    }
}