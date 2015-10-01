import java.util.Scanner;

public class Pseudocode1
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Phone number: ");
        String pn = scanner.next();
        String acode = pn.substring(0,3);
        String three = pn.substring(3,6);
        String four = pn.substring(6,10);
        System.out.println("(" + acode + ")-" + three + "-" + four);
    }
}