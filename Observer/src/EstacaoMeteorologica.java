import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private float temperatura, umidade, pressao;

    public void adicionar(Observer o){
        observers.add(o);
    }

    public void remover(Observer o){
        observers.remove(o);
    }

    public void notificar(){
        for (Observer o : observers){
            o.atualizar(temperatura, umidade, pressao);
        }
    }

    //simula uma nova leitura 
    public void setMedicoes(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificar(); //avisa os displays
    }   
}

//guarda os dados e avisa os displays   