public class PerfilUsuario {
    private String nome;
    private String email;

    public PerfilUsuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Atualiza o estado do perfil
    public void setEstado(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("-> Perfil alterado para: Nome: " + novoNome + ", Email: " + novoEmail);
    }

    // Cria um Memento com o estado atual
    public PerfilMemento salvarEstado() {
        // O Memento encapsula o estado interno
        return new PerfilMemento(this.nome, this.email);
    }

    // Restaura o estado a partir de um Memento
    public void restaurar(PerfilMemento memento) {
        if (memento != null) {
            this.nome = memento.getNome();
            this.email = memento.getEmail();
            System.out.println("<- Perfil restaurado para: Nome: " + this.nome + ", Email: " + this.email);
        }
    }

    // Exibe o estado atual
    public void exibirPerfil() {
        System.out.println("  PERFIL ATUAL: Nome [" + nome + "], Email [" + email + "]");
    }
}
