package Datatype_practise;

public class CarFeatures {
    public static void main(String[] args) {
        // Basic Car Features using Primitive Data Types
        String brand = "Toyota";           // Non-primitive (String)
        String model = "Camry";            // Non-primitive (String)
        int year = 2023;                   // Primitive (int)
        float engineCapacity = 2.5f;       // Primitive (float)
        boolean isElectric = false;        // Primitive (boolean)
        char fuelType = 'P';               // Primitive (char), P for Petrol, D for Diesel, E for Electric
        double price = 32000.99;           // Primitive (double)
        byte seats = 5;                    // Primitive (byte)
        long mileage = 35000L;             // Primitive (long)

        // Output the car features
        System.out.println("Car Features:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity + "L");
        System.out.println("Is Electric: " + isElectric);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: $" + price);
        System.out.println("Number of Seats: " + seats);
        System.out.println("Mileage: " + mileage + " km");
    }
}
