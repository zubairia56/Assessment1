class Car {
    String brand;

    // Default constructor
    Car() {
        brand = "BMW";
    }

    // Parameterized constructor
    Car(String b) {
        brand = b;
    }

    public static void main(String[] args) {
        Car car1 = new Car();     // default constructor
        Car car2 = new Car("Audi");  // user-provided brand

        System.out.println("Car 1 Brand: " + car1.brand);
        System.out.println("Car 2 Brand: " + car2.brand);
    }
}
