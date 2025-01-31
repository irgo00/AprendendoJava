package aprendizado.poo.AulaPOO20304bd.src;

public class Produto {
    
    private int id;
    private String nome;
    
    private double precoUnitario;

    public Produto() {
        id = 0;
        nome = "";
        precoUnitario = 0;
    }

    public Produto(String nome, double precoUnitario) {
        id = 0;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public Produto(int id, String nome, double precoUnitario) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return nome + " " + precoUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
