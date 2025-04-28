public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    //verificação para saber se o cliente vai ser aprovado ou recusado
    public void processar(Cliente cliente) {
        if (verificar(cliente)) {
            if (next != null) {
                next.processar(cliente);
            } else {
                System.out.println("Crédito aprovado!");
            }
        } else {
            System.out.println("Crédito recusado.");
        }
    }

    protected abstract boolean verificar(Cliente cliente);
}

//abstrata para ser estendida pelas outras classes