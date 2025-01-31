package aprendizado.poo.AulaPOO20104bd.src;

public class Loja {
 
    private int id;
    private String nome;

    public Loja() {
        id = 0;
        nome = "";
    }

    public Loja(String nome) {
        id = 0;
        this.nome = nome;
    }

    public Loja(int id, String nome) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
