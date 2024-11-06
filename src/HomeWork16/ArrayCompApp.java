package HomeWork16;

public class ArrayCompApp {
    public static void main(String[] args) {
        CompSmd res1 = new CompSmd("R1", "R1206", 1);
        CompSmd res2 = new CompSmd("R2", "R0806", 11 );
        CompSmd res3 = new CompSmd("R3", "R1206", 18000 );
        CompSmd res4 = new CompSmd("R4", "R1206", 10002 );
        CompSmd res5 = new CompSmd("R5", "R1206", 14 );
        CompSmd res6 = new CompSmd("R6", "R1206", 180002 );
        CompSmd res7 = new CompSmd("R7", "R1206", 1855532 );
        CompSmd res8 = new CompSmd("R8", "R0603", 18932 );

        CompSmd [] testAddAll = {res2, res3, res4, res5, res6, res7, res8};

        MagicArray listTest = new MagicArray();
        System.out.println(listTest.size());
        for(int i = 0; i < 100; i++){
            listTest.append(res1);
        }
        System.out.println(listTest.size());
        listTest.addAll(testAddAll);
        System.out.println(listTest.size());
        for(int i = 0; i < 100; i++) {
            listTest.remove(0);
        }
        System.out.println(listTest.size());
        System.out.println(listTest.removeByValue(res2));
        System.out.println(listTest.size());

        System.out.println(listTest.remove(0).toString());// R3
        System.out.println(listTest.toStringList());
        //System.out.println(listTest.get(100).toString()); // Exception  "IndexOutOfBounds"
        System.out.println(listTest.get(4).toString()); // R8
        System.out.println(listTest.size());




    }
}
