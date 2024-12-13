package HomeWork27;

public class SeasonsApp {
    public static void main(String[] args) {
        for (Seasons season: Seasons.values()) {
            System.out.println(season.returnMiddleTemp());
        }
    }
}
