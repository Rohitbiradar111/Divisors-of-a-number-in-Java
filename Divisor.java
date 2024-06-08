//This program prints all the divisors of a number in Java

public class Divisor {
    public static void main(String args[])
    {
        int num = 100;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}