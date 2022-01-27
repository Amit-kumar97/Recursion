import java.util.Scanner;

//---------------Represent Lexicographical numbers using Recursion
public class LexicographicallyNumber {
    public static void main(String[] args) {
        //-------------user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial and End Number for Lexicographically order:");
        int initial = sc.nextInt();                               //-----------Says 0
        int end = sc.nextInt();                                   //-----------says 100
        System.out.println("Lexicographical numbers:");
        m1(initial,end);                                          //-----------Method Calling
        System.out.println("Total Number of Counts of Lexicographical numbers:"+c);
    }
    //------------------Static variable for counting numbers initialises with 0
    static int c=0;
    //-----------------Static method for implementing logic here
    public static void m1(int initial,int end)
    {
        //---------base condition
        if(initial>end)
        {
            return;
        }
        c++;                                     //------------------count increases by 1 before every recursive call
        System.out.println(initial);
        int i=0;                                //------------------local variable
        if(initial==0)                          //------------------if number start with 1 than only loop traverse 9 times else 10 times
        {
            i=1;
        }
        while (i<10)
        {
            m1(initial*10+i,end);                //-------------Recursive call
            i++;                                       //-------------increasing i for next iteration
        }
    }
}
