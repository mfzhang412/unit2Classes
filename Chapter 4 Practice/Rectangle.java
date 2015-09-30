import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rectangle's length: ");
        double l = scanner.nextDouble();
        System.out.print("Rectangle's width: ");
        double w = scanner.nextDouble();
        System.out.println("Area: " + (l*w));
        System.out.println("Perimeter: " + (2*l+2*w));
        double diagonal = Math.pow((l*l + w*w),.5);
        System.out.println("Diagonal: " + diagonal);
    }
}