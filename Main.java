public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setBrand("BMW")
                .setModel("M5 F90")
                .setEngine("4.4L V8 twin-turbo")
                .setColor("Black")
                .setSeats(5)
                .setHasSunroof(true)
                .build();

        Car familyCar = new Car.Builder()
                .setBrand("Lexus")
                .setModel("LX 570")
                .setEngine("5.7L")
                .setHasSunroof(true)
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
