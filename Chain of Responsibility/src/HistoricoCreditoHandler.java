public class HistoricoCreditoHandler extends Handler {
    @Override
    protected boolean verificar(Cliente cliente) {
        return !cliente.possuiRestricao;
    }
}

//checa se o cliente não tem restrição
//retorne true se o cliente não tiver restrição no nome