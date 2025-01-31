package polimorfismo;

public class AppExemploPolimorfismo {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("123.345.345-56", "Zé 1");
        Aluno a2 = new Aluno("433.345.345-67", "Zé 2");
        Aluno a3 = new Aluno("987.345.345-43", "Zé 3");
        
        Professor p1 = new Professor("123.345-6", "Jão 1");
        Professor p2 = new Professor("654.333-8", "Jão 2");
        
        Pessoa pessoas[] = new Pessoa[5];
        pessoas[0] = a1;
        pessoas[1] = a2;
        pessoas[2] = a3;
        
        pessoas[3] = p1;
        pessoas[4] = p2;
        
        for (Pessoa p: pessoas){
            System.out.println(p);
            if (p instanceof Aluno){
                Aluno a = (Aluno) p;                
            }
        }
        
    }
    
}
