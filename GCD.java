import java.util.Scanner;

/*
Java program to demonstrate How to find Greatest Common Divisor or GCD of * two numbers using Euclid’s method.
 */
public class GCD {
    public static void main(String args[]) {

        //Enter two number whose GCD needs to be calculated.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("GCD of the NUmbers "+num1+" and "+num2+" is:"+findgcd(num1,num2));
    }
    public static int findgcd(int num1, int num2)
    {
        //------------Base condition
        if (num2 ==0)
        {
        return num1;
        }
        return findgcd(num2,num1%num2);
    }
}
