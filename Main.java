public class Main {
    public static void main(String[] args) {
        // 1. Cria o Originator e o Caretaker
        ProcessoCheckout checkout = new ProcessoCheckout("Login", "UsuarioLogado: true");
        HistoricoCheckout historico = new HistoricoCheckout();

        checkout.exibirStatus();

        // 2. Transição para Etapa 1: Endereço
        historico.salvarMemento(checkout.salvarEstado()); // Salva o estado "Login"
        checkout.setEstado("Endereço", "Rua A, n° 100");
        checkout.exibirStatus();

        // 3. Transição para Etapa 2: Envio
        historico.salvarMemento(checkout.salvarEstado()); // Salva o estado "Endereço"
        checkout.setEstado("Envio", "Entrega Normal (5 dias)");
        checkout.exibirStatus();

        // 4. Transição para Etapa 3: Pagamento
        historico.salvarMemento(checkout.salvarEstado()); // Salva o estado "Envio"
        checkout.setEstado("Pagamento", "Cartão de Crédito");
        checkout.exibirStatus();

        System.out.println("\n--- Iniciando Desfazer (Undo) ---");

        // 5. Desfaz a última alteração (volta de Pagamento para Envio)
        CheckoutMemento m1 = historico.desfazer();
        checkout.restaurar(m1);
        checkout.exibirStatus();

        // 6. Desfaz mais uma alteração (volta de Envio para Endereço)
        CheckoutMemento m2 = historico.desfazer();
        checkout.restaurar(m2);
        checkout.exibirStatus();

        // 7. Tentativa de desfazer quando não há mais histórico
        CheckoutMemento m3 = historico.desfazer(); // Volta para Login
        checkout.restaurar(m3);
        checkout.exibirStatus();

        historico.desfazer(); // Não há mais estados salvos

    }
}
