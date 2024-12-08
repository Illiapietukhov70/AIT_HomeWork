package HomeWork25.MagicArrayGen;

public class MagicArrayApp {
    public static void main(String[] args) {
        MagicArrayGen<Integer> magicArrayGenInt = new MagicArrayGen<>();
        magicArrayGenInt.append(12);
        magicArrayGenInt.append(24);
        System.out.println(magicArrayGenInt.size());
        System.out.println(magicArrayGenInt.get(1));
        magicArrayGenInt.set(1, 248);
        System.out.println(magicArrayGenInt.get(1));
        Object[] addArray = {1,2,3,4,5,6,7,8,9,10};
        magicArrayGenInt.addAll(addArray);
        System.out.println(magicArrayGenInt.size());
        System.out.println(magicArrayGenInt.toString());
        System.out.println(magicArrayGenInt.indexOf(248));
        System.out.println(magicArrayGenInt.remove(10));
        System.out.println(magicArrayGenInt.toString());
        MagicArrayGen<String> magicArrayGenStr = new MagicArrayGen<>();
        magicArrayGenStr.append("String");
        Object[]addArrayStr = {"abra", "co", "dabra", "focus", "pokus"};
        magicArrayGenStr.addAll(addArrayStr);
        System.out.println(magicArrayGenStr.toString());

    }
}
