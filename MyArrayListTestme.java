package SaxaThinkData;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * @Saxa
 * @param <T>
 *
 */
public class MyArrayListTestme<T> implements List<T> {
    int size;
    private T[]array;


    public MyArrayListTestme() {
        array = (T[]) new Object[10];
        size = 0;
    }
    public static void main (String[] args){
        MyArrayListTestme<Integer> mal=new MyArrayListTestme<Integer>();
        mal.add(1);
        mal.add(2);
        mal.add(3);
        System.out.println(Arrays.toString(mal.toArray()) +"size="+mal.size);
        mal.remove(new Integer(2));
        System.out.println(Arrays.toString(mal.toArray())+"size="+mal.size);


    }
    public boolean add(T element){
        return false;

    }
    public void add (int index, T element){
        if (index<0 ||index>size){
            throw new IndexOutOfBoundsException();

        }
        add (element);
        for (int i=size-1; i>index; i--){
            array[i]= array[i-1];

        }
        array[index]=element;

    }
    public boolean addAll(Collection<? extends T> collection){
        boolean flag=true;
        for (T element: collection) {
            flag &= add(element);

        }
        return flag;


    }
    public boolean addAll(int index, Collection<? extends T> collection){
        throw new UnsupportedOperationException();

    }
    public boolean contains(Object obj){
        return indexOf(obj) != -1;

    }
    public boolean cantainsAll(Collection<?> collection){
        for (Object element: collection){
            if (!contains(element)){
                return false;
            }
        }
        return true;

    }
    public T get(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException();

        }
        return array[index];

    }
    public int indexOf(Object target){
        return -1;

    }
    private boolean equals(Object target, Object element){
        if (target == null ) {
            return element == null;

        }else {
            return target.equals(element);

        }

    }
    public boolean isEmpty(){
        return size == 0;

    }
    public Iterator<T> iterator(){
        T[] copy= Arrays.copyOf(array, size);
        return Arrays.asList(copy).iterator();

    }
    public int lastIndexOf(Object target){
        for (int i= size-1; i>0; i--){
            if (equals(target, array[i])){
                return i;

            }
        }
        return -1;

    }
    public ListIterator<T> listIterator(){
        T[] copy = Arrays.copyOf(array, size);
        return Arrays.asList(copy).listIterator();

    }
    public ListIterator<T> listIterator(int index){
        T[] copy = Arrays.copyOf(array, size );
        return Arrays.asList(copy).listIterator(index);

    }
    public boolean remove(Object obj){
        int index = indexOf(obj);
        if (index==-1){
            return false;

        }
        remove(index);
        return true;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public T remove(int index){
        return null;

    }
    public boolean removeAll(Collection<?> collection){
        boolean flag= true;
        for (Object obj: collection){
            flag &= remove(obj);

        }
        return flag;

    }
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {

    }

    public T set(int index, T element){
        return null;

    }
    public int size(){
        return size;

    }
    public List<T> subList(int fromIndex, int toIndex){
        if (fromIndex<0 || toIndex >= size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();

        }
        T[] copy= Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(copy);

    }
    public Object[] toArray(){
        return Arrays.copyOf(array, size);

    }
    public <U> U[] toArray(U[] array){
        throw new UnsupportedOperationException();

    }

}
