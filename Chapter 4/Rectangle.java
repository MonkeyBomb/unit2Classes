import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double length, width;
        System.out.print("Enter a number for the length ");
        length = scanner.nextDouble();
        System.out.print("Eneter a number for the width ");
        width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area " +area);
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter " +perimeter);
        //finds the diagonal of a square
        double d1 = Math.pow(length,2) + Math.pow(width,2);
        double d2 = Math.sqrt(d1);
        System.out.println("Diagonal " +d2);
     
        
        
        
        
    }
}
