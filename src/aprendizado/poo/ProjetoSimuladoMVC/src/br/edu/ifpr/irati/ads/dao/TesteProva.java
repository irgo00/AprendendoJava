package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.dao;

import br.edu.ifpr.irati.ads.modelo.Candidato;
import br.edu.ifpr.irati.ads.modelo.Prova;
import br.edu.ifpr.irati.ads.modelo.Questao;

public class TesteProva {

    public static void main(String[] args) {
        
        ProvaDAO provaDAO = new ProvaDAO();
        
        //Prova p = provaDAO.carregarProva();
        //provaDAO.cadastrarProva(p);
        //System.out.println(p.getQuestoes().get(0).getAlternativas()[0].getTexto());
        
        Prova p = provaDAO.buscarProvaPorAno(2023);
        for (Questao q: p.getQuestoes()){
            System.out.println(q);
        }
        
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        String cpf = "12345678914";
        Candidato candidato = candidatoDAO.buscarCPF(cpf);
        
        System.out.println(candidato);
        
    }
    
}
