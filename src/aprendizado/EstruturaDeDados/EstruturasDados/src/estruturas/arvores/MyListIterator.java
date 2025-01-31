package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.arvores;

public class MyListIterator<T> implements MyIterator<T>{

    private MyLinkedList<T> list;
    private T cursor;
    
    public MyListIterator(MyLinkedList<T> list){
        this.list = list;
        cursor = (list.isEmpty()) ? null : list.get(0);
    }
    
    @Override
    public boolean hasNext() {
        return (cursor != null);
    }

    @Override
    public T next() throws Exception {
        if (cursor == null){
            throw new Exception("Não há mais elementos");
        }else{
            T t = cursor;
            try{
                cursor = list.get(list.indexOf(cursor)+1);
            }catch(IndexOutOfBoundsException obx){
                cursor = null;
            }
            return t;
        }
    }    
}
