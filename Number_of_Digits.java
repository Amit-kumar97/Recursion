import java.util.Scanner;

/*
A program to find out and return the number of digits present in a number recursively.
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */
public class Number_of_Digits {
    //-----------Declaring integer Variable
    int n;
    //-----------Constructor
    Number_of_Digits()
    {
        this.n = n;
    }
    //-----------Method here to implement the logic of Recursion
    public static int calculatedigit(int n)
    {
        if(n/10==0)                                  //--------Base condition
        {
            return 1;
        }
        return 1+calculatedigit(n/10);              //-------recursion call
    }
}
//------------execution class
class numberofdigitstest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number:");
        int n = sc.nextInt();
        Number_of_Digits obj = new Number_of_Digits();
        System.out.println("Number of Digits in the given Number:"+obj.calculatedigit(n));
    }
}
