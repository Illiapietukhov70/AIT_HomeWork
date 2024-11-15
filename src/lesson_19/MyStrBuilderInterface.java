package lesson_19;

public interface MyStrBuilderInterface {
    // append(...)
    // insert(int offset, ...): Вставляет строковое представление любого типа данных в указанную позицию.
    // replace(int start, int end, String str): Заменяет подстроку в диапазоне от start до end указанной строкой.
    // delete(int start, int end): Удаляет подстроку в диапазоне от start до end.
    // deleteCharAt(int index): Удаляет символ в указанной позиции.
    // length(): Возвращает текущую длину последовательности символов.
    // charAt(int index): Возвращает символ в указанной позиции.
    // substring(int start, int end): Возвращает подстроку в диапазоне от start до end.

    void append(String string);
    void append(String [] strings);
    void replace(int start, int end, String str);
    void delete(int start, int end);
    void deleteCharAt(int index);
    int length();
    String substring(int start, int end);
    void setLength(int newLength);
    String reverse();
    String toString();










}
