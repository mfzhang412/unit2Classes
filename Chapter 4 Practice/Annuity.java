public class Annuity
{
   public static void main(String[] args)
   {
      double pmt = 10000.0;
      double i = .08;
      double n = 20.0;
      
      double numerator = ((Math.pow((1+i), (n-1)))-1)/i;
      double denominator = Math.pow((1+i), (n-1));
      double pvann = pmt*((numerator/denominator) + 1);
      
      System.out.println(pvann);
   }
}