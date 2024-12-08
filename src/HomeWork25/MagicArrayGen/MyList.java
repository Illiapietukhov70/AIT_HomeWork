package HomeWork25.MagicArrayGen;

public interface MyList<T> {


    void append(T value);
    void append(T value, int index);
    int size();
    void addAll(T... values);
    int indexOf(T value);
    int lastIndexOf(T value);
    boolean contains(T value);
    T[] toArray();
    boolean remove(T value);
    T remove(int index);
    boolean isEmpty();
    T get(int index);
    void set (int index, T value);

}
