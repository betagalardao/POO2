public class CreditoDisponivelHandler extends Handler {
    @Override
    protected boolean verificar(Cliente cliente) {
        return cliente.creditoDisponivel;
    }
}

//checar se tem crédito disponivel 