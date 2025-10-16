public class ProcessoCheckout {
    private String etapaAtual;
    private String dadosCheckout;

    public ProcessoCheckout(String etapaInicial, String dadosIniciais) {
        this.etapaAtual = etapaInicial;
        this.dadosCheckout = dadosIniciais;
    }

    // Atualiza o estado do checkout
    public void setEstado(String novaEtapa, String novosDados) {
        this.etapaAtual = novaEtapa;
        this.dadosCheckout = novosDados;
        System.out.println("-> Checkout atualizado para: " + novaEtapa + " com dados: " + novosDados);
    }

    // Cria um Memento com o estado atual [cite: 25]
    public CheckoutMemento salvarEstado() {
        // O Memento encapsula o estado interno
        return new CheckoutMemento(this.etapaAtual, this.dadosCheckout);
    }

    // Restaura o estado a partir de um Memento [cite: 26]
    public void restaurar(CheckoutMemento memento) {
        if (memento != null) {
            this.etapaAtual = memento.getEtapaAtual();
            this.dadosCheckout = memento.getDadosSalvos();
            System.out.println("<- Estado restaurado para: " + this.etapaAtual + " com dados: " + this.dadosCheckout);
        }
    }

    // Exibe o estado atual
    public void exibirStatus() {
        System.out.println("  STATUS ATUAL: Etapa [" + etapaAtual + "], Dados: [" + dadosCheckout + "]");
    }
}
