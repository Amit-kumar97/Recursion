import java.util.Scanner;

/*
A recursive function to convert a decimal no into a binary no, print the binary number.
 */
public class DecimalToBinary {
    int num1;
    //---------constructor
    DecimalToBinary()
    {
        this.num1 = num1;
    }
    
    //-------recursion method for implementing the logic
    public static int changetobinary(int num1)
    {
        //-----------Base condition
        if (num1==0)
        {
            return 0;
        }
        //-----------Recursion Call
        int binary = (num1%2)+10*changetobinary(num1/2);
        return binary;
    }
}
//-----------Execution Class
class decimaltobinarytest {
    //-----------Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number:");
        int num1 = sc.nextInt();

        DecimalToBinary obj = new DecimalToBinary();
        System.out.println("Binary Number of given Decimal Number:"+obj.changetobinary(num1));
    }
}
