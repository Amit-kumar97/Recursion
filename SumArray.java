import java.util.Scanner;

/*
A program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7 
 */
public class SumArray {
    //-----------Declaring integer Variable and Array of type Integer
    int n;
    int ar[];
    //-----------Constructor
    SumArray()
    {
        this.n = n;
        ar = new int[n];
    }
    //------------Method here to implement the logic
    public static int sumarray(int n,int ar[])
    {
        if(n<=0)                                        //------------Base condition
        {
            return 0;
        }
        return ar[n-1]+sumarray(n-1,ar);                //-------------Recursive Call, sum calculated from last
    }
}
//------------------Execution Class
class sumarraytest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the Elements of Array:");
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        SumArray obj = new SumArray();
        System.out.println("Sum of the Elements of the given Array is:"+obj.sumarray(size,ar));
    }
}
