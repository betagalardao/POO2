public class GarantiaHandler extends Handler {
    @Override
    protected boolean verificar(Cliente cliente) {
        return cliente.possuiGarantia;
    }
}

//checa se o cliente possui garantia