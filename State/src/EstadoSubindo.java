public class EstadoSubindo implements EstadoElevador{

    @Override
    public void subir(Elevador elevador){
        System.out.println("Elevador já está subindo.");
    }

    @Override
    public void descer(Elevador elevador){
        System.out.println("O elevador não pode descer enquanto está subindo.");
    }

    @Override
    public void parar(Elevador elevador){
        System.out.println("Parando elevador...");
        elevador.setEstado(new EstadoParado());
    }
}