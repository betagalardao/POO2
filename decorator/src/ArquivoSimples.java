public class ArquivoSimples implements Arquivo {
    @Override
    public void salvar(String dados) {
        System.out.println("Salvando dados: " + dados);
    }
}
