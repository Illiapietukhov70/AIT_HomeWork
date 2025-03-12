package homework_45;

import java.time.LocalDate;
import java.util.Random;

public class RandomDateGenerator {
    private final LocalDate dataMin;
    private final LocalDate dataMax;

    public RandomDateGenerator(LocalDate dataMin, LocalDate dataMax) {
        this.dataMin = dataMin;
        this.dataMax = dataMax;
    }
    public LocalDate generateDate() {
        int minDay = (int) dataMin.toEpochDay();
        int maxDay = (int) dataMax.toEpochDay();
        long randomDay = minDay + new Random().nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
