package aprendizado.EstruturaDeDados.AulaED1004.src;

import java.util.Comparator;

public class ComparadorCarta implements Comparator<Carta>{

    @Override
    public int compare(Carta c1, Carta c2) {
        return c1.getValor() - c2.getValor();
    }
    
    
    
}
