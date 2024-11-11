package HomeWork16;

import HomeWork15.CompSMD;

public interface MagicArrayList {
    CompSmd get(int index);
    int indexOf(CompSmd comp);
    void append(CompSmd comp);//Ностальгия по питону...
    void append(CompSmd comp, int index);// Хочу именно туда
    void addAll(CompSmd... values);
    CompSmd remove(int index);
    boolean removeByValue(CompSmd comp);
    String toStringList();
    void clear();
    int size();
    int lastIndexOf(CompSmd comp);
    CompSmd[] toArray();

}
