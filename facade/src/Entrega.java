import java.util.UUID;

public class Entrega {
    public double calcularFrete(String endereco) {
        if (endereco.toLowerCase().contains("interior")) {
            return 20.0;
        } else {
            return 10.0;
        }
    }

    public String gerarCodigoRastreamento() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
