import java.util.Stack;

public class HistoricoCheckout {
    // Pilha para armazenar os Mementos (histórico de edições) [cite: 285, 286]
    private Stack<CheckoutMemento> historico = new Stack<>();

    // Salva um novo estado no histórico (PUSH na pilha) [cite: 141, 287, 289]
    public void salvarMemento(CheckoutMemento memento) {
        historico.push(memento);
        System.out.println("\n[Historico] Estado de checkout salvo: " + memento.getEtapaAtual());
    }

    // Desfaz o último estado salvo (POP na pilha) [cite: 143, 297, 309]
    public CheckoutMemento desfazer() {
        if (!historico.isEmpty()) { // Verifica se há histórico [cite: 310]
            CheckoutMemento mementoDesfeito = historico.pop(); // Remove e retorna o último [cite: 143, 311]
            System.out.println("[Historico] Último estado desfeito.");
            return mementoDesfeito;
        }
        System.out.println("[Historico] Não há estados anteriores para desfazer.");
        return null; // Retorna nulo se não houver histórico [cite: 312]
    }
}
