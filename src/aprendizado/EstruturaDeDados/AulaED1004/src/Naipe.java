package aprendizado.EstruturaDeDados.AulaED1004.src;

public class Naipe {
    
    private String nome;

    public Naipe() {
        nome = "";
    }

    public Naipe(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
}
