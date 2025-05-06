public class Conversor {

    private ApiService api;

    public Conversor() {
        this.api = new ApiService();
    }

    public double converter(String origem, String destino, double valor) {
        try {
            double taxa = api.getTaxaCambio(origem, destino);
            return valor * taxa;
        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
            return -1;
        }
    }
}
