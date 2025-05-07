public interface Subject{
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers();

    //avisa a estação quando algo muda
}