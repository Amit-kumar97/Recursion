import java.util.Scanner;

/*
A method that returns true if element n is a member of given array  and false if not  by using the recursion 
 */
public class SearchElementArray {
    //--------variable Declaration
    int n;
    int ar[];
    int size;
    //---------Constructor
    SearchElementArray() {
        int ar[] = new int[size];
        this.n = n;
    }
    //----------Recursion Method
    public static int searchArray(int n, int ar[],int index) throws ArrayIndexOutOfBoundsException           //-----Handle the Exception for element not present in the array
    {
        //---------Base condition
        if (ar[index]==n)
        {
            return 0;
        }
        else
        {
            index = searchArray(n,ar,index+1);
            return 1;
        }
    }
}
//-----------execution class
class SearcheElementArraytest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the Elements of Array:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the Number that You want to Search in Array:");
        int n = sc.nextInt();
        int index = 0;
        SearchElementArray obj = new SearchElementArray();
        try {
            if (obj.searchArray(n,ar,index)==1)
            {
                System.out.println("True");
            }
            else
            {

                System.out.println("False");
            }
        }
        catch (ArrayIndexOutOfBoundsException ob)
        {
            System.out.println("False");
        }
    }

}
