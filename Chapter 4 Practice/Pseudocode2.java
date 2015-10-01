import java.util.Scanner;

public class Pseudocode2
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount due (in pennies): ");
        Integer amountDue = scanner.nextInt();
        System.out.print("Amount received (in pennies): ");
        Integer amountReceived = scanner.nextInt();
        Integer changeLeft = amountReceived - amountDue;
        Integer dollars = changeLeft / 100;
        Integer quarters = (changeLeft % 100) / 25;
        Integer dimes = (changeLeft % 2500) / 10;
        Integer nickels = (changeLeft % 250000) / 5;
        Integer pennies = (changeLeft % 1250000);
        System.out.println("Dollars: " + dollars + "\tQuarters: " + quarters + "\tDimes: " + dimes + "\tNickels: " + nickels + "\tPennies: " + pennies);
    }
}