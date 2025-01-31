package polimorfismo;

public class Professor extends Pessoa{
    
    private String siape;

    public Professor() {
        super();
        siape = "";
    }

    public Professor(String siape, String nome) {
        super(nome);
        this.siape = siape;
    }
    

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return siape;
    }
    
    
    
}
