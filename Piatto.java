abstract class Piatto {
    public String nome;

    public Piatto(String nome) {
        this.nome = nome;
    }

    public abstract void prepara();
}