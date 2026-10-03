import java.util.Scanner;
class WaterBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water consumed in liters : ");
        double waterconsumed = scanner.nextDouble();

       if(waterconsumed <= 500) {
            System.out.println("The water bill amount is: 100");
        } 
        else {
            System.out.println("The water bill amount is: 200");
        }

        scanner.close();
    }
}