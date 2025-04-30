public class Main {
    public static void main(String[] args) {
        Handler h1 = new CreditoDisponivelHandler();
        Handler h2 = new RendaCompativelHandler();
        Handler h3 = new HistoricoCreditoHandler();
        Handler h4 = new GarantiaHandler();

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);

        Cliente cliente = new Cliente(
            4000.00,     
            900.00,      
            true, //cliente vai ser recusado por ter restrição   
            true,        
            true         
        );

        h1.processar(cliente);
    }
}
