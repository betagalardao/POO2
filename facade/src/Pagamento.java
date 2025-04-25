public class Pagamento{
    public boolean processarPagamento(String metodoPagamento){
        boolean aprovado = metodo.equalsIgnoreCase("cartao") ||
                           metodo.equalsIgnoreCase("pix") ||
                           metodo.equalsIgnoreCase("boleto");

        if(aprovado){
            System.out.println("Pagamento aprovado com "+metodoPagamento);
        } else{
            System.out.println("Falha no pagamento: método não aceito")
        }

        return aprovado;                     
    }
}