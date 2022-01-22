import java.util.Scanner;

public class SumArray {
    int n;
    int ar[];
    SumArray()
    {
        this.n = n;
        ar = new int[n];
    }
    public static int sumarray(int n,int ar[])
    {
        if(n<=0)
        {
            return 0;
        }
        return ar[n-1]+sumarray(n-1,ar);
    }
}
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
