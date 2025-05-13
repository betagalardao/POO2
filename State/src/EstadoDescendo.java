public class EstadoDescendo implements EstadoElevador{
    @Override
    public void subir(Elevador elevador) {
        System.out.println("Não pode subir enquanto está descendo.");
    }

    @Override
    public void descer(Elevador elevador){
        System.out.println("Elevador já está descendo.");
    }

    @Override
    public void parar(Elevador elevador){
        System.out.println("Parando o elevador...");
        elevador.setEstado(new EstadoParado());
    }
}
