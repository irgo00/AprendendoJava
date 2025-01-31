package aprendizado.EstruturaDeDados.AulaED2503array.src;

public class Carta {

    private String simbolo;
    private int valor;
    private Naipe naipe;

    public Carta() {
        simbolo = "A";
        valor = 1;
        naipe = new Naipe("Copas");
    }

    public Carta(String simbolo, int valor, Naipe naipe) {
        this.simbolo = simbolo;
        this.valor = valor;
        this.naipe = naipe;
    }
        
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return this.getSimbolo() + " " + this.getValor() + " " + this.getNaipe();
    }

    
    
}
