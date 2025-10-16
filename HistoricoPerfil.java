import java.util.Stack;

public class HistoricoPerfil {
    // Pilha para armazenar os Mementos (histórico de edições)
    private Stack<PerfilMemento> historico = new Stack<>();

    // Salva um novo estado no histórico (PUSH na pilha)
    public void salvarMemento(PerfilMemento memento) {
        historico.push(memento);
        System.out.println("\n[Historico] Estado do perfil salvo: " + memento.getNome());
    }

    // Desfaz o último estado salvo (POP na pilha)
    public PerfilMemento desfazer() {
        if (!historico.isEmpty()) {
            PerfilMemento mementoDesfeito = historico.pop(); // Remove e retorna o último
            System.out.println("[Historico] Última edição desfeita.");
            return mementoDesfeito;
        }
        System.out.println("[Historico] Não há histórico de edições para desfazer.");
        return null; // Retorna nulo se não houver histórico
    }
}
