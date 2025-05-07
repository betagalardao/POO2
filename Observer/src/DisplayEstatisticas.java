import java.util.ArrayList;
import java.util.List;

public class DisplayEstatisticas implements Observer {
    private List<Float> temperaturas = new ArrayList<>();

    @Override
    public void atualizar(float temperatura, float umidade, float pressao){
        temperaturas.add(temperatura);

        float soma = 0;
        float min = temperaturas.get(0); 
        float max = temperaturas.get(0);

        //percorre todas as temperaturas 
        for (float temp : temperaturas){
            soma += temp;
            if (temp < min) min = temp;
            if (temp > max) max = temp;
        }

        float media = soma / temperaturas.size();

        System.out.printf("Estatísticas -> Média: %.1f, Mín: %.1f, Máx: %.1f\n", media, min, max);
    }
}
