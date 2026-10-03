import java.util.Scanner;
class HouseHold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members in the household:");
        int members = sc.nextInt();
        System.out.println("Enter the amount of water consumed(in litres):");
        double waterConsumption = sc.nextDouble();
        System.out.println("Enter the house number:");
        int houseNumber = sc.nextInt();
        System.out.println("Enter the water usage status(A for Average, F for Fair, B for Bad):");
        char status = sc.next().charAt(0);
    

        System.out.println("Members: " + members);
        System.out.println("Water Consumption: " + waterConsumption + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + status);
    }
}