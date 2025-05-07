public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        Observer atual = new DisplayAtual();
        Observer estatisticas = new DisplayEstatisticas();
        Observer previsao = new DisplayPrevisao();
        Observer logger = new DisplayLogger();

        estacao.adicionar(atual);
        estacao.adicionar(estatisticas);
        estacao.adicionar(previsao);
        estacao.adicionar(logger);

        estacao.setMedicoes(25.0f, 60.0f, 1013.0f);
        estacao.setMedicoes(27.0f, 65.0f, 1014.0f);
        estacao.setMedicoes(23.5f, 70.0f, 1011.0f);
    }
}
