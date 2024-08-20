package models;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int input;
        System.out.println("Enter the value for measurement:");
        input = sc.nextInt();
        Measurement measurement = new Measurement(input);

        System.out.println("Meters to Centimeters:" + measurement.getCm());
        System.out.println("Meters to Kilometers:" + measurement.getKm());
        System.out.println("Measurement to Millimeters:" + measurement.getMm());
        System.out.println("Measurement to Decimeters:" + measurement.getDm());
    }
}
