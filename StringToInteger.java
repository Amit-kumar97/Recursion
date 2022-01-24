import java.util.Scanner;

/*
A recursive function to convert a given string into the number it represents. That is input will be a numeric string
that contains only numbers, you need to convert the string into a corresponding integer and return the answer.
Do It recursively.
Sample Input:
“2029”
Sample Output:
2029
 */
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String of Number:");
        String str = sc.next();                            //----------"2029";
        System.out.println("After converting into Number:"+convertinteger(str));
    }
    public static int convertinteger(String str)
    {
        //--------base condition
        //--------Recursive call for the sub-string starting at the second character
        if (str.length() == 1)
        {
            return (str.charAt(0)-'0');
        }
        //------------- First digit multiplied by the appropriate power of 10 and then add the recursive result
        int num = convertinteger(str.substring(1));          //---------- Recursive call for the sub-string starting at the second character
        int res = str.charAt(0)-'0';                       //------------First digit of the number
        //-------------------For example, xy = ((x * 10) + y)
        res = (int) (res*Math.pow(10,str.length()-1)+num);
        return res;
    }
}
