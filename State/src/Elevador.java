public class Elevador{
    private EstadoElevador estado;

    public Elevador(){
        this.estado = new EstadoParado(); 
    }

    public void setEstado(EstadoElevador estado){
        this.estado = estado;
    }

    public void subir(){
        estado.subir(this);
    }

    public void descer(){
        estado.descer(this);
    }

    public void parar(){
        estado.parar(this);
    }
}
