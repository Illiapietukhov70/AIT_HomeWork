package HomeWork22;

public class MainRace {
    public static void main(String[] args) {
        Car car = new Car("Diesel", "VW");
        Bicycle bicycle = new Bicycle("Turist");
        Motorcycle motorcycle = new Motorcycle("Ducati", "1158Cub");

        Vehicle [] vehicles = new Vehicle[]{car, bicycle, motorcycle};

        for (Vehicle vehicle: vehicles) {
            vehicle.startEngine();
        }
        System.out.println("==============================UpCastTest===========================");

        ((Bicycle) motorcycle).startEngine();
        System.out.println("=============================DownCastTest==========================");



        Bicycle bicycle1 = new Motorcycle("Suzuki", "1000Cub");


        ((Motorcycle) bicycle1).startEngine();// И велосипед поехал
        System.out.println(bicycle1.getClass());//И он мотоцикл





    }
}
