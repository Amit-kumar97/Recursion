import java.util.Scanner;

public class Scratch {
    // Remove character from the string
    // input = "neeraj"
    // output= "neerj"
    // removing character a from the string

    public static String remove(String str) {
        // base case
        if (str.length() == 0) {
            return str;
        }
        String result = "";
        // i think i mentioned == here insted of !=  in class
        if (str.charAt(0) != 'a') {
            result = result + str.charAt(0);
        }
        // recursive call
        String recans = remove(str.substring(1));
        return result + recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name ="neeraj";
        System.out.println(remove(name));
    }
}
