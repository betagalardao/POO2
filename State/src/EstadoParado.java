public class EstadoParado implements EstadoElevador{

    @Override
    public void subir(Elevador elevador){
        System.out.println("Elevador subindo...");
        elevador.setEstado(new EstadoSubindo());
    }

    @Override
    public void descer(Elevador elevador){
        System.out.println("Elevador descendo...");
        elevador.setEstado(new EstadoDescendo());
    }

    @Override
    public void parar(Elevador elevador){
        System.out.println("Elevador já está parado.");
    }
}