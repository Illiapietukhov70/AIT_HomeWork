package HomeWork17;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasya", 66, 1726.34);

        System.out.println(employee.info());

        System.out.println(employee.getName());

        employee.setName("Petya");

        System.out.println(employee.getName());


    }
}
