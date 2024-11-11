package HomeWork16;


import java.util.Arrays;

public class MagicArray implements MagicArrayList{
    private CompSmd[] array = new CompSmd[10];
    private int size = 0;

    @Override
    public CompSmd get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public int indexOf(CompSmd comp) {
        for(int i = 0; i < size; i++){
            if(array[i].equals(comp)) {
                return i;
            }
        }
    return Integer.MAX_VALUE;
    }

    @Override
    public void append(CompSmd comp) {
        expandArray();
        array[size] = comp;
        size++;

    }

    @Override
    public void append(CompSmd comp, int index) {
        expandArray();
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = comp;
        size++;
    }

    @Override
    public void addAll(CompSmd... values) {
        for(int i = 0; i < values.length; i++) {
            append(values[i]);
        }

    }

    @Override
    public CompSmd remove(int index) {
        checkIndex(index);
        CompSmd temp = array[index];
        for(int i = index; i < size -1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return temp;
    }

    @Override
    public boolean removeByValue(CompSmd comp) {
        for(int i = 0; i < size; i++){
            if(array[i].equals(comp)) {
                CompSmd temp = remove(i); // ToDo что то можно еще сделать!
                return true;
            }
        }
        return false;
    }

    @Override
    public String toStringList() {
        if(size == 0) return "[]";
        String result = "[";
        for(int i = 0; i < size; i++) {
            result = result +array[i].toString() + ((i < size - 1)? ", ": "]");
        }
        return result;
    }

    @Override
    public void clear() {
        array = new CompSmd[10];
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }
    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
    private void expandArray() {
        if(size >= array.length){
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    @Override
    public int lastIndexOf(CompSmd comp) {
        int result = -1; // Not Element in Array
        for(int i = size - 1; i >= 0; i--) {
            if(array[i].equals(comp)) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public CompSmd[] toArray() {
        CompSmd [] newArray = new CompSmd[size];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
