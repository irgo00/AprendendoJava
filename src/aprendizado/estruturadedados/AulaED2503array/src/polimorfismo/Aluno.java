package polimorfismo;

public class Aluno extends Pessoa{
    
    private String cpf;

    public Aluno() {
        super();
        cpf = "";
    }

    public Aluno(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
 
    
    
}
