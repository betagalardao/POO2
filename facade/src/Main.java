import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LojaOnline loja = new LojaOnline();

        loja.realizarCompra(
            Arrays.asList("Notebook", "Mouse"), 
            "pix",                           
            "Rua Principal, Interior"       
        );
    }
}
