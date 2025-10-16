public class PerfilMemento {
    // Atributos finais (imutáveis) para armazenar o estado
    private final String nome;
    private final String email;

    // Construtor: O Originator usa isso para salvar o estado
    public PerfilMemento(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Métodos para o Originator recuperar o estado
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
