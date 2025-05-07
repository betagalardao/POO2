public class DisplayAtual implements Observer[
    //Exibe a leitura mais recente.

    @Override
    public void atualizar(float temperatura, float umidade, float pressao){
        System.out.println("Atual -> Temp: " + temperatura + ", Umidade: " + umidade + ", Pressão: " + pressao);
    }
]