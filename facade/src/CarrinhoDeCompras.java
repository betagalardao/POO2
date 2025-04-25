import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{

    //itens é a variavel privada para que só a própria classe mexa nela diretamente
    private List<String> itens; //lista para adicionar produtos na lista

    //método para add itens na lista
    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>(); //cria a lista vazia
    }

    //void porque não retorna nada, só adiciona os itens
    public void adicionarItem(String item){
        itens.add(item); //.add é um método da ArrayList que insere algo na lista
    }

    //pegar a lista para usar depois
    public List<String> getItens(){
        return itens;
    }
}