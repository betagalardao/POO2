public class CompressaoDecorator implements Arquivo {
    private Arquivo arquivoDecorado;

    public CompressaoDecorator(Arquivo arquivo) {
        this.arquivoDecorado = arquivo;
    }

    @Override
    public void salvar(String dados) {
        String dadosComprimidos = compressao(dados);
        arquivoDecorado.salvar(dadosComprimidos);
    }

    private String compressao(String dados) {
        return "[Comprimido] " + dados;
    }
}
