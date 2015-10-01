import java.util.Scanner;

public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number between 1000 and 999999: ");
        String number = scanner.next();
        Integer numlength = number.length();
        String hundreds = number.substring(numlength - 3, numlength);
        String thousands = number.substring(0, numlength - 3);
        System.out.println(thousands + "," + hundreds);
    }
}