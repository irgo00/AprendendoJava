package aprendizado.EstruturaDeDados.AulaED2703array.src;

public class MyArray {
    
    private int maxEntries;
    private int numEntries;
    private Object objetos[];

    public MyArray() {
        maxEntries = 100;
        numEntries = 0;
        objetos = new Object[maxEntries];
    }
    
    public MyArray(int n){
        maxEntries = n;
        numEntries = 0;
        objetos = new Object[maxEntries];
    }

    
    public void add(Object objeto) throws Exception{
        
        if (!isFull()){
            objetos[numEntries] = objeto;
            numEntries++;
        }else{
            throw new Exception("Array cheio");
        }
        
    }
    
    public void remove(Object objeto) throws Exception {
        
        int i = indexOf(objeto);
        for (int j = i; j < numEntries - 1; j++) {
            objetos[j] = objetos[j + 1];
        }
        objetos[numEntries - 1] = null;
        numEntries--;    
    }

    
    public int indexOf(Object o) throws Exception {
        
        int i = -1;
        for (int x = 0; x < numEntries; x++){
            if (objetos[x] == o){
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
    
    public Object get(int i) throws Exception {
        
        if (i >= 0 && i <= numEntries-1){
            return objetos[i];
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
    
    /**
     * 
     * @param array1
     * @param array2
     * @return um novo MyArray com tamanho igual ao número de elementos concatenados 
     */
    public static MyArray concatenate(MyArray array1, MyArray array2) throws Exception{
        MyArray novo = new MyArray(array1.size()+array2.size());
        for (int i = 0; i < array1.size(); i++){
            novo.add(array1.get(i));
        }
        for (int i = 0; i < array2.size(); i++){
            novo.add(array2.get(i));
        }
        return novo;
    }
    
    public MyArray concatenate(MyArray array) throws Exception{
        MyArray novo = new MyArray(this.size()+array.size());
        for (int i = 0; i < this.size(); i++){
            novo.add(this.get(i));
        }
        for (int i = 0; i < array.size(); i++){
            novo.add(array.get(i));
        }
        return novo;
    }
            
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();        
        for (int i = 0; i < numEntries; i++){
            sb.append(objetos[i]);
            sb.append("\n");            
        }
        return sb.toString();        
    }
    
}
