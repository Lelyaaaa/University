public class Main
{
    public static void main(String[] args) {
        Car car0 = new Car();
        Car car1 = new Car(
                "BMW",
                "a777aa777",
                "black",
                1998

        );
        Car car2 = new Car(
                "BMW",
                "black",
                2005
        );
        car2.To_String();
        System.out.print("Лет машине: ");
        car2.AgeOfCar();
    };

}
