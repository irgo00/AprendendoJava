package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.controle;

import br.edu.ifpr.irati.ads.dao.CandidatoDAO;
import br.edu.ifpr.irati.ads.dao.ProvaDAO;
import br.edu.ifpr.irati.ads.dao.RespostaDAO;
import br.edu.ifpr.irati.ads.modelo.Candidato;
import br.edu.ifpr.irati.ads.modelo.EstadoResposta;
import br.edu.ifpr.irati.ads.modelo.Prova;
import br.edu.ifpr.irati.ads.modelo.Questao;
import br.edu.ifpr.irati.ads.modelo.Resposta;
import br.edu.ifpr.irati.ads.visao.SimuladoGUI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Controle {

    private Prova prova;
    private Candidato candidato;
    private Questao questaoAtual;
    private Resposta respostaAtual;
    private RespostaDAO respostaDAO;
    private SimuladoGUI simuladoGUI;
    private int pontuacaoQuestoes;

    public Controle() {
        prova = new Prova();
        candidato = new Candidato();
        questaoAtual = new Questao();
        respostaAtual = new Resposta();
        respostaDAO = new RespostaDAO();
        this.pontuacaoQuestoes = 60;
    }
    
    
    
    public void abrirTelaCandidato(){
        String cpf = JOptionPane.showInputDialog(null, "Informe seu CPF", "Identificação do Usuário", JOptionPane.QUESTION_MESSAGE);
        carregarCandidato(cpf);
    }
    
    public void abrirTelaPrincipal(){
        simuladoGUI = new SimuladoGUI(this);
        simuladoGUI.setVisible(true);
    }
    
    public void carregarCandidato(String cpf){
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        candidato = candidatoDAO.buscarCPF(cpf);
    }
    
    public void carregarProva(int ano){
        ProvaDAO provaDAO = new ProvaDAO();
        prova = provaDAO.buscarProvaPorAno(ano);
        mudarQuestaoAtual(prova.getQuestoes().get(0));
    }
    
    public void mudarQuestaoAtual(Questao questao){
        questaoAtual = questao;
        respostaAtual = respostaDAO.buscarResposta(candidato, questaoAtual);
    }
    
    public void registrarResposta(int soma){
        respostaAtual.setSoma(soma);
        respostaDAO.salvarResposta(respostaAtual);
    }
    
    public double corrigirQuestao(){
        return this.respostaAtual.calcularPontuacao(this.pontuacaoQuestoes);
    }
    
    public boolean[] obterArrayMarcacao(int soma){
        return this.respostaAtual.gerarArrayMarcacao(soma);
    }
    
    public EstadoResposta[] obterEstadoResposta(){
        return this.respostaAtual.obterEstadosResposta();
    }
    
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
            }
        } catch (Exception e) {
        }
        Controle controle = new Controle();
        controle.abrirTelaCandidato();
        controle.carregarProva(2023);
        controle.abrirTelaPrincipal();
    }

    public Candidato getCandidato() {
        return candidato;
    }
    
    public Prova getProva() {
        return prova;
    }

    public Questao getQuestaoAtual() {
        return questaoAtual;
    }

    public Resposta getRespostaAtual() {
        return respostaAtual;
    }            
}
