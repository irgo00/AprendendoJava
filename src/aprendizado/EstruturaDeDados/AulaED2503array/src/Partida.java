package aprendizado.EstruturaDeDados.AulaED2503array.src;

public class Partida{
    
    private String nomeJogador;
    private int score;

    public Partida() {
        nomeJogador = "";
        score = 0;
    }

    public Partida(String nomeJogador, int score) {
        this.nomeJogador = nomeJogador;
        this.score = score;
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return this.nomeJogador + " " + this.score;
    }
    
    
    
}
