import java.util.Scanner;

/*
Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with
character c2 in the given string.
Do this recursively.
Sample Input :
abaca
a x
Sample Output :
xbxcx
 */
public class ReplaceCharacterString {
    public static void main(String[] args) {
        //-------------User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();                                     //-----------"abaca";
        System.out.println("Enter a character that you want to replace from the given String:");
        char ch1 = sc.next().charAt(0);                            //--------'a';
        System.out.println("Enter a character from which you want to replace given character from the String:");
        char ch2 = sc.next().charAt(0);                             //-------------'x';
        System.out.println(replace_char(str,ch1,ch2));
    }
    //------------method here to implement the logic
    public static String replace_char(String str, char ch1,char ch2)
    {
        //-----------Base condition
        if(str.length()==0)
        {
            return str;
        }
        String result = "";                                    //--------creating a local empty string
        if(str.charAt(0)==ch1)                                 //--------if character matches than it will replace with ch2
        {
            result = result + ch2;
        }
        else                                                   //---------if character not matches than it will append same character
        {
            result = result + str.charAt(0);
        }
        String res_ans = replace_char(str.substring(1),ch1,ch2);              //--------recursion call
        return result+res_ans;
    }
}
