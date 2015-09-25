public class DistanceConverter
{
   public static final int feetConverter = 3;
   public static final int inchesConverter = 12;
   
   public static void main(String[] args)
   
   {
      double yards = 3.5;
      double feet = yards * feetConverter;
      double inches = feet * inchesConverter;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}