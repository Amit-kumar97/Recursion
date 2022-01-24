import java.util.Scanner;

/*
In a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
 */
public class RemoveConsecutiveDuplicateString {
    public static void main(String[] args) {
        //---------------user Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  String:");
        String str = sc.next();                             //------------"aabccba";
        System.out.println("String after removing duplicate characters:"+removeduplicate(str));
    }
    //---------Method for implementing the logic
    public static String removeduplicate(String str)
    {
        //------------base condition
        if(str.length()<=1)
        {
            return str;
        }
        String result = "";                                 //-------------creating a local empty string
        if (str.charAt(0)!=str.charAt(1))                   //-------------if character not matches to next character than it will append to result variable
        {
            result = result + str.charAt(0);
        }
        String rec_ans = removeduplicate(str.substring(1));                     //----------recursion call
        return result+rec_ans;
    }
}
