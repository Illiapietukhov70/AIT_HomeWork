package HomeWork27.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(isEmailValid(email)){
            this.email = email;
        }

    }

    public boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-_]+\\.[A-Za-z]{2,}");// Добавил "_" согласно условий, но обычно я этот Паттерн использую
        Matcher matcher = pattern.matcher(email);
        if(matcher.find() && Character.isAlphabetic(email.charAt(0))) { // Добавил требование "Первый символ должен быть буквой"
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String strTest = "!%$@&*()[]";
        boolean testPassLwCase = false, testPassUpCase = false, testDigit = false, testSimbol = false;
        for (Character elem: password.toCharArray()) {
             if(Character.isLowerCase(elem)) testPassLwCase = true;
             if (Character.isUpperCase(elem)) testPassUpCase = true;
             if (Character.isDigit(elem)) testDigit = true ;
             if (strTest.contains(elem.toString())) testSimbol = true;
        }
        if(testPassLwCase && testPassUpCase && testDigit && testSimbol && password.length() >= 8){
            this.password = password;
        }

    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
