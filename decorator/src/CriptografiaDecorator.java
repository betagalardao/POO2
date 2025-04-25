public class CriptografiaDecorator implements Arquivo {
    private Arquivo arquivoDecorado;

    public CriptografiaDecorator(Arquivo arquivo) {
        this.arquivoDecorado = arquivo;
    }

    @Override
    public void salvar(String dados) {
        String dadosCriptografados = criptografia(dados);
        arquivoDecorado.salvar(dadosCriptografados);
    }

    private String criptografia(String dados) {
        return "[Criptografado] " + dados;
    }
}
