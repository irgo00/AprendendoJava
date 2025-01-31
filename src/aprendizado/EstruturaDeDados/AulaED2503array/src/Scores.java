package aprendizado.EstruturaDeDados.AulaED2503array.src;

public class Scores {
    
    private int maxEntries;
    private int numEntries;
    private Partida partidas[];

    public Scores() {
        maxEntries = 100;
        numEntries = 0;
        partidas = new Partida[maxEntries];
    }
    
    public Scores(int n){
        maxEntries = n;
        numEntries = 0;
        partidas = new Partida[maxEntries];
    }

    
    public void add(Partida partida) throws Exception{
        
        if (!isFull()){
            partidas[numEntries] = partida;
            numEntries++;
        }else{
            throw new Exception("Array cheio");
        }
        
    }
    
    public void remove(Partida partida) throws Exception {
        
        int i = indexOf(partida);
        for (int j = i; j < numEntries - 1; j++) {
            partidas[j] = partidas[j + 1];
        }
        partidas[numEntries - 1] = null;
        numEntries--;    
    }

    
    public int indexOf(Partida p) throws Exception {
        
        int i = -1;
        for (int x = 0; x < numEntries; x++){
            if (partidas[x] == p){
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
    
    public Partida get(int i) throws Exception {
        
        if (i >= 0 && i <= numEntries-1){
            return partidas[i];
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
            sb.append(partidas[i]);
            sb.append("\n");            
        }
        return sb.toString();        
    }
    
}
