public class Annuity
{
   public static void main(String[] args)
   {
      double pmt = 10000.0;
      double i = .08;
      double n = 20.0;
      double pvann = pmt*((((Math.pow((1+i), (n-1))) - 1) / i) / (Math.pow((1+i), (n-1))));
      System.out.print (pvann);
   }
}