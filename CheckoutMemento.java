public class CheckoutMemento {
    // Atributos finais (imutáveis) para armazenar o estado
    private final String etapaAtual;
    private final String dadosSalvos; // Usaremos String para simplificar os 'dados'

    // Construtor: O Originator usa isso para salvar o estado
    public CheckoutMemento(String etapa, String dados) {
        this.etapaAtual = etapa;
        this.dadosSalvos = dados;
    }

    // Métodos para o Originator recuperar o estado
    public String getEtapaAtual() {
        return etapaAtual;
    }

    public String getDadosSalvos() {
        return dadosSalvos;
    }
}
