public class DisplayLogger implements Observer{
    @Override
    public void atualizar(float temperatura, float umidade, float pressao){
        System.out.println("[LOG] Temp: " + temperatura + ", Umid: " + umidade + ", Pressão: " + pressao);
    }
}
