import java.util.Scanner;

/*
Write a recursive method for computing the sum of all the elements of an array.
Start with an algorithm in English, then translate this algorithm into code. 
Trace your method on the example of the following array with 3 elements: 2, 0, and 1.
 */
//----------------MAIN CLASS
public class SumArray02 {
    //--------------VARIABLE DECLARATION
    int size;
    int ar[];
    //-------------CONSTRUCTOR
    SumArray02()
    {
        this.size = size;
        ar = new int[size];
    }
    //-----------RECURSION METHOD TO IMPLEMENT THE LOGIC
    public static int recursion_sum(int size,int ar[])
    {
        //-----------BASE CONDITION
        if (size<=0)
        {
            return 0;
        }
        int sum = ar[size-1] + recursion_sum(size-1,ar);                  //----------RECURSION CALLING IT STARTS FROM THE END UPTO 0TH INDEX
        return sum;                                                           //----------RETURN SUM
    }
}
//----------EXECUTION CLASS
class sumarray02test
{
    //------------MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          //----------CREATING THE OBJECT OF SCANNER CLASS TO TAKE INPUT FROM THE USER
        System.err.println("Enter the Size of Array:");
        int size = sc.nextInt();                                      //---------SIZE OF ARRAY
        int ar[] = new int[size];                                     //---------ARRAY CREATION 
        System.err.println("Enter Elements of Array:");
        for (int i=0; i<ar.length; i++) 
        {
            ar[i] = sc.nextInt();                                     //--------ARRAYS VALUES ENTER BY USER
        }
        SumArray02 obj = new SumArray02();                            //--------OBJECT CREATION OF MAIN CLASS
        System.err.println("Sum of Arrays Elements:");
        System.err.println(obj.recursion_sum(size,ar));               //--------CALLING MAIN CLASS RECURSION METHOD WITH THE HELP OF OBJECT
    }
}
