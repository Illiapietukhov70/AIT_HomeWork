package HomeWork21;

import lesson_19.MyStrBuild;

public class Passenger {
    private static int counter;
    private final int id;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id = counter++;
    }

    @Override
    public String toString() {
        MyStrBuild msb = new MyStrBuild("Passenger: {");
        msb.append("id=");
        msb.append(id);
        msb.append(", name='");
        msb.append(name);
        msb.append("}");

        return  msb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
