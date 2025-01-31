package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.modelo;

public class Resposta {
    
    private int id;
    private Questao questao;
    private Candidato candidato;
    private int soma;

    public Resposta() {
        id = 0;
        questao = new Questao();
        candidato = new Candidato();
        soma = 0;
    }

    public Resposta(int id, Questao questao, Candidato candidato, int soma) {
        this.id = id;
        this.questao = questao;
        this.candidato = candidato;
        this.soma = soma;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    public boolean[] gerarArrayMarcacao(int v) {
        double valor = v;
        int n_alt = this.questao.getAlternativas().length;
        boolean array[] = new boolean[n_alt];
        for (int i = n_alt - 1; i >= 0; i--) {
            double v_alt = Math.pow(2, i);
            if (valor >= v_alt) {
                array[i] = true;
                valor = valor - v_alt;
            } else {
                array[i] = false;
            }
        }
        return array;
    }
    
    public double calcularPontuacao(int pontuacaoMaximaQuestao){
        
        boolean arrayGabarito[] = this.gerarArrayMarcacao(this.questao.getSomaGabarito());
        boolean arrayMarcado[] = this.gerarArrayMarcacao(this.soma);

        int nAlternativasCertas = 0;
        for (int i = 0; i < arrayGabarito.length; i++) {
            if (arrayGabarito[i]) {
                nAlternativasCertas++;
            }
        }
              
        int nMarcadasCerto = 0;
        int nMarcadasErrado = 0;
        for (int i = 0; i < this.questao.getAlternativas().length; i++) {
            if (arrayGabarito[i] == true && arrayMarcado[i] == true) {
                nMarcadasCerto++;
            }
            if (arrayGabarito[i] == false && arrayMarcado[i] == true) {
                nMarcadasErrado++;
            }
        }
        if (nMarcadasErrado > 0) {
            return 0;
        } else {
            return 1.0 * pontuacaoMaximaQuestao * nMarcadasCerto / nAlternativasCertas;
        }
    }
    
    public EstadoResposta[] obterEstadosResposta(){
        
        boolean arrayGabarito[] = this.gerarArrayMarcacao(this.questao.getSomaGabarito());
        boolean arrayMarcado[] = this.gerarArrayMarcacao(this.soma);
        EstadoResposta estado[] = new EstadoResposta[arrayGabarito.length];                
        for (int i = 0; i < estado.length; i++) {
            estado[i] = EstadoResposta.NAO_MARCOU;
            if (arrayGabarito[i] == true && arrayMarcado[i] == true) {
                estado[i] = EstadoResposta.MARCOU_CERTO;
            }
            if (arrayGabarito[i] == false && arrayMarcado[i] == true) {
                estado[i] = EstadoResposta.MARCOU_ERRADO;
            }
        }
        return estado;
    }
    
    
    
    
}
