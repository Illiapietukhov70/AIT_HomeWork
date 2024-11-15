package lesson_19;

public class MyStrBuild implements MyStrBuilderInterface{
    private String inputString; // Вводимая строка (изначальная)
    private char [] inputArray;// Массив (исходный)
    private String outSting;// Вывод


    public MyStrBuild(String inputString) {
        this.inputString = inputString;
        this.inputArray = inputString.toCharArray(); // Сразу при ините - создаем Массив символолов
        this.outSting = inputString;

    }


    @Override
    public void append(String string) {
        if(string != null) {
            char[] appendArray = string.toCharArray();
            char[] resultArray = new char[inputArray.length + appendArray.length]; // Длинна выводного Массива
            System.arraycopy(inputArray, 0, resultArray, 0, inputArray.length); // Копирование Изначального
            System.arraycopy(appendArray, 0, resultArray, inputArray.length, appendArray.length); // Копирование Введенного
            inputArray = resultArray;
        }
    }

    @Override
    public void append(String[] strings) {
        if (strings.length > 0 && strings != null) {
            for (int i = 0; i < strings.length; i++) {
                append(strings[i]); // Для каждого элемента - обычный аппенд
            }
        }

    }

    @Override
    public void replace(int start, int end, String str) { // Если end - start > length пишем только часть если < пишем все потом "0"
        if (end > start && str.length() > 0 && start >= 0 && start < this.inputArray.length) {// end не проверяю т к он больше старт и старт должен быть в поле Внутреннего Массива
            int stop = (end - start) < str.length()? (end - start): str.length();
            char[] replaceChar = new char[end - start];// Получили Массив длиной вставки
            for (int i = 0; i < stop; i++) {
                replaceChar[i] = str.charAt(i); // со строки в массив
                }
            // Тут Массив для вставки готов
            for (int j = start, h = 0; h < replaceChar.length; j++, h++) {
                if(j < inputArray.length) { // Пока не вышли из поля Введенного Массива
                    this.inputArray[j] = replaceChar[h]; // Заполняем с Индекса Старта и пока не закончится Внутренний Массив
                }
            }
        }


    }

    @Override
    public void delete(int start, int end) {
        if(start >= 0 && start < end && start < inputArray.length) {
            int realEnd = end < inputArray.length ? inputArray.length - end : 0;
            char[] deleteChar = new char[start + realEnd]; // Поняли размер выходного Массива
            for (int i = 0; i < start; i++) {
                deleteChar[i] = inputArray[i]; // Записали до старта удаления
            }
            if (end < inputArray.length) {// Записали после End (если он в поле Массива)
                for (int j = start, h = end; h < inputArray.length; j++, h++) { // В принципе можно прямо start & end = но это для понимания
                    deleteChar[j] = inputArray[h];
                }
            }
            inputArray = deleteChar; // переименовали Массив
        }
    }


    @Override
    public void deleteCharAt(int index) {
        if(index >= 0 && index < inputArray.length) {
            delete(index,(index + 1));
        }


    }

    @Override
    public int length() {
        return inputArray.length;
    }


    @Override
    public String substring(int start, int end) {
        outSting = "";
        if(start >= 0 && end > start && start < inputArray.length) {
            int stop = end < inputArray.length? end:  inputArray.length;// Определили длину Строки вывода
            char[] substringArray = new char[stop - start];
            for(int i = start, j = 0; j < substringArray.length; i++, j++) {
                substringArray[j] = inputArray[i];
            }
            outSting = new String(substringArray);
        }
        return outSting;
    }

    @Override
    public void setLength(int newLength) {
        if(newLength >= 0) {
            char [] newLenArray = new char[newLength];
            int stop = inputArray.length < newLenArray.length?inputArray.length:newLenArray.length;
            for(int i = 0; i < stop; i++){
                newLenArray[i] = inputArray[i];
            }
            inputArray = newLenArray;
        }

    }

    @Override
    public String reverse() {
        char [] reverseArray = new char[inputArray.length];
        for(int i = 0; i < reverseArray.length; i++) {
            reverseArray[reverseArray.length - 1 - i] = inputArray[i];
        }
        outSting = new String(reverseArray);
        return outSting;
    }

    @Override
    public String toString() {
        this.outSting = new String(inputArray);
        return outSting;
    }
}
