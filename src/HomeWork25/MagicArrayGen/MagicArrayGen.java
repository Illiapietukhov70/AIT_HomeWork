package HomeWork25.MagicArrayGen;


import HomeWork16.CompSmd;

import java.util.Arrays;

public class MagicArrayGen<T> implements MyList {
    private T[] array;
    private int size;

    public MagicArrayGen() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    public MagicArrayGen(T[] ints) {

        if (ints != null) {
            this.array = (T[]) new Object[ints.length * 2];
            addAll(ints);
        } else {
            this.array = (T[]) new Object[10];
        }

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void expandArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    @Override
    public void append(Object value) {
        expandArray();
        array[size] = (T) value;
        size++;
    }

    @Override
    public void append(Object value, int index) {
        expandArray();
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = (T) value;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addAll(Object[] values) {
        for(int i = 0; i < values.length; i++) {
            append((T)values[i]);
        }
    }

    @Override
    public int indexOf(Object value) {
        for(int i = 0; i < size; i++){
            if(array[i].equals((T)value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        int result = -1; // Not Element in Array
        for(int i = size - 1; i >= 0; i--) {
            if(array[i].equals((T) value)) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public boolean contains(Object value) {
        for(T elem: array) {
            if(elem != null){
                if(elem.equals((T) value)){
                    return true;
            }

            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new MagicArrayGen[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
    }


    @Override
    public boolean remove(Object value) {
        for(int i = 0; i < size; i++){
            if(array[i].equals((T) value)) {
                Object temp = remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        T temp = array[index];
        for(int i = index; i < size -1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return temp; // Типо pop в питоне TODO
    }

    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void set(int index, Object value) {
        checkIndex(index);
        array[index] = (T) value;

    }

    @Override
    public String toString() {
        return "MagicArrayGen{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
