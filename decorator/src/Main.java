public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new ArquivoSimples();

        //normal
        arquivo.salvar("Texto original");

        //comprimir
        Arquivo arquivoComprimido = new CompressaoDecorator(arquivo);
        arquivoComprimido.salvar("Texto original");

        //criptografar
        Arquivo arquivoCriptografado = new CriptografiaDecorator(arquivo);
        arquivoCriptografado.salvar("Texto original");

        //os dois
        Arquivo arquivoComprimidoECriptografado = new CriptografiaDecorator(new CompressaoDecorator(arquivo));
        arquivoComprimidoECriptografado.salvar("Texto original");
    }
}
