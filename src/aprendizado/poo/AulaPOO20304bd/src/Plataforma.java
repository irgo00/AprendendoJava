package aprendizado.poo.AulaPOO20304bd.src;

public class Plataforma {
    
    private int id;
    private String nome;

    public Plataforma() {
        id = 0;
        nome = "";
    }

    public Plataforma(String nome) {
        id = 0;
        this.nome = nome;
    }

    public Plataforma(int id, String nome) {
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
        return nome; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
