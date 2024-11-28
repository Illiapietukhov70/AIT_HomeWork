package lesson_23;

public class MainTest {
    public static void main(String[] args) {
        MainStatTest test = new MainStatTest();
        ChTest cht1 = new ChTest("First");
        /* Как бы композиция - т. к.
        экземпляр  TempClass создается в момет инита и имеено в конструкторе ChTest
        */
        ChTest cht2 = new ChTest("Next");
        cht1.setSuperArr();
        cht2.setSuperArr();
        for(int i = 0; i < test.getMainArr().size(); i++) {
            System.out.println(test.getMainArr().get(i).getName());
        }
        for(int i = 0; i < cht1.getSuperArr().size(); i++) {
            System.out.println(cht1.getSuperArr().get(i).getName());
        }
        System.out.println(cht1.getSuperArr().hashCode());
        System.out.println(test.getMainArr().hashCode());

        cht1 = null;
        /* Но после удаление экземпляра ChTest  -  экземпляр TempClass живет и процветает */
        for(int i = 0; i < test.getMainArr().size(); i++) {
            System.out.println(test.getMainArr().get(i).getName());
        }
        /* И какой тут термин ассоциации уместен?
        "...В типичном примере, экземпляр двигателя будет создаваться в конструкторе автомобиля..."
        НО!!! если setSuperArr делаем в конструкторе = все исчезает (Все по классике композиции)
        */



        }
    }

