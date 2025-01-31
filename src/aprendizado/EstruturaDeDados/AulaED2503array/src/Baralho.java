package aprendizado.EstruturaDeDados.AulaED2503array.src;

public class Baralho {
    
    private int maxEntries;
    private int numEntries;
    private Carta cartas[];

    public Baralho() {
        maxEntries = 100;
        numEntries = 0;
        cartas = new Carta[maxEntries];
    }
    
    public Baralho(int n){
        maxEntries = n;
        numEntries = 0;
        cartas = new Carta[maxEntries];
    }

    
    public void add(Carta carta) throws Exception{
        
        if (!isFull()){
            cartas[numEntries] = carta;
            numEntries++;
        }else{
            throw new Exception("Array cheio");
        }
        
    }
    
    public void remove(Carta carta) throws Exception {
        
        int i = indexOf(carta);
        for (int j = i; j < numEntries - 1; j++) {
            cartas[j] = cartas[j + 1];
        }
        cartas[numEntries - 1] = null;
        numEntries--;    
    }

    
    public int indexOf(Carta p) throws Exception {
        
        int i = -1;
        for (int x = 0; x < numEntries; x++){
            if (cartas[x] == p){
                i = x;
                break;
            }
        }        
        if (i == -1){
            throw new Exception("Não encontrado");
        }else{
            return i;
        }
        
    }
    
    public Carta get(int i) throws Exception {
        
        if (i >= 0 && i <= numEntries-1){
            return cartas[i];
        }else{
            throw new Exception("Índice inválido");
        }
        
    }
    
    public boolean isEmpty(){
        if (numEntries == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull(){
        if (maxEntries == numEntries){
            return true;
        }else{
            return false;
        }
    }
    
    public int size(){
        return numEntries;
    }
    
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();        
        for (int i = 0; i < numEntries; i++){
            sb.append(cartas[i]);
            sb.append("\n");            
        }
        return sb.toString();        
    }
    
}
