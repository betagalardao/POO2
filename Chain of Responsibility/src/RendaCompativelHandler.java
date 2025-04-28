public class RendaCompativelHandler extends Handler {
    @Override
    protected boolean verificar(Cliente cliente) {
        return cliente.valorParcela <= cliente.rendaMensal * 0.25;
    }
}

//checa se a parcela é ≤ 25% da renda