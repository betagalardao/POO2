public class DisplayPrevisao implements Observer{
    private float ultimaPressao = 1020f;

    @Override
    public void atualizar(float temperatura, float umidade, float pressao){
        System.out.print("Previsão -> ");
        if (pressao > ultimaPressao) {
            System.out.println("Tempo melhorando!!");
        } else if (pressao < ultimaPressao) {
            System.out.println("Tempo pode piorar..");
        } else {
            System.out.println("Sem mudanças.");
        }
        ultimaPressao = pressao;
    }
}
