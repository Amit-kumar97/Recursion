import java.util.Scanner;

/*
A program to print numbers from 1 to n in increasing order recursively.
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
public class IncreasingNumber {
    //-----------Declaring integer Variable
    int n;
    //-----------Constructor
    IncreasingNumber()
    {
        this.n = n;
    }
    //-----------Method here to impleent the logic of Recursion
    public static void printnumber(int n)
    {
        if(n==0)                           //--------Base condition
        {
            return;
        }
        printnumber(n-1);                //-------recursion call
        System.out.println(n);
    }
}
//------------execution class
class increasingnumbertest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        IncreasingNumber obj = new IncreasingNumber();
        System.out.println("Number in increasing order:");
        obj.printnumber(n);
    }
}
