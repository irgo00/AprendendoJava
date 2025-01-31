package aprendizado.EstruturaDeDados.AulaED1504.src;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class MyArray<T> {
    
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

    
    public void add(T objeto) throws Exception{
        
        if (!isFull()){
            objetos[numEntries] = objeto;
            numEntries++;
        }else{
            throw new Exception("Array cheio");
        }
        
    }
    
    public void remove(T objeto) throws Exception {
        
        int i = indexOf(objeto);
        for (int j = i; j < numEntries - 1; j++) {
            objetos[j] = objetos[j + 1];
        }
        objetos[numEntries - 1] = null;
        numEntries--;    
    }

    
    public int indexOf(T o) throws Exception {
        
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
    
    public T get(int i) throws Exception {
        
        if (i >= 0 && i <= numEntries-1){
            return (T) objetos[i];
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
    
    public void shuffle() throws Exception{
        
        Object novo_vetor[] = new Object[maxEntries];
        Random gerador = new Random((new Date()).getTime());
        
        int entries = numEntries;
        for (int i = 0; i < entries; i++){
            int x = gerador.nextInt(0, numEntries);
            T t = (T) objetos[x];
            this.remove(t);//subtrai numEntries
            novo_vetor[i] = t;            
        }
        
        this.objetos = novo_vetor;
        numEntries = entries;
        
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
    
    public void sort(MethodSort method, Comparator<T> comparator){
        switch (method) {
            case BUBBLESORT:
                bubbleSort(comparator);
                break;
            case SELECTIONSORT:
                selectionSort(comparator);
                break;
            case INSERTIONSORT:
                insertionSort(comparator);
                break;
            default:
                throw new AssertionError("Método inválido");
        }
    }
    
    private void bubbleSort(Comparator<T> comparador) {

        int N = this.objetos.length;
        int pivo = this.objetos.length - 2;
        Object aux;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i <= pivo; i++) {
                if (comparador.compare( (T) this.objetos[i], (T) this.objetos[i + 1]) > 0){
                    aux = this.objetos[i + 1];
                    this.objetos[i + 1] = this.objetos[i];
                    this.objetos[i] = aux;
                }
            }
        }
    }
    
    private void selectionSort(Comparator<T> comparador) {
        int N = this.objetos.length;

        Object aux;
        for (int j = 0; j < N; j++) {
            Object menor = this.objetos[j];
            int pMenor = j;
            for (int i = j+1; i < N; i++) {
                if (comparador.compare( (T) this.objetos[i], (T) menor) < 0){
                    menor = this.objetos[i];
                    pMenor = i;
                }
            }
            aux = this.objetos[pMenor];
            this.objetos[pMenor] = this.objetos[j];
            this.objetos[j] = aux;
        }
    }
    
    private void insertionSort(Comparator<T> comparador) {

        int N = this.objetos.length;
        for (int j = 1; j < N; j++){
            Object aux = this.objetos[j];
            int i;
            for (i = j; i > 0 && comparador.compare( (T) this.objetos[i-1], (T) aux) >= 0; i--){
                this.objetos[i] = this.objetos[i-1];
            }
            this.objetos[i] = aux;
        }
        
    }
    
}
