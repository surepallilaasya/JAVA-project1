import java.util.Scanner;
public class TotalWaterConsumption {
   public int morningUsage() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter morning water usage in liters: ");
      int morningUsage = input.nextInt();
      return morningUsage;
    }
    public int eveningUsage() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter evening water usage in liters: ");
      int eveningUsage = input.nextInt();
      return eveningUsage;
    }
    public static void main(String[] args) {
      TotalWaterConsumption waterConsumption = new TotalWaterConsumption();
      int morningUsage = waterConsumption.morningUsage();
      int eveningUsage = waterConsumption.eveningUsage();
      int totalUsage = morningUsage + eveningUsage;
      System.out.println("Total water consumption for the day: " + totalUsage + " liters");
    }
}