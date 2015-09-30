public class Annuity
{
   public static void main(String[] args)
   {
       // parameters
       double pmt = 10000;
       // periodic payment
       double i =  0.08;
       // periodic interest
       double n = 20;
       // number of payments
       
       double an1 = Math.pow(1+i,n-1);
       double an2 = an1 - 1;
       double an3 = an2 / i;
       double an4 = an3 / Math.pow(1+i,n-1);
       double an5 = an4 + 1;
       double answer = an5 * pmt;
       //rounding to two decimal places
       double answer2 = (int)(answer * 100);
       double answer3 = answer2 / 100.0;
       System.out.println(answer3);
    }
}

