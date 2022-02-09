//----------Code snippet 02

public class Problem_1Q_02 {
    
    public static void print(int n)
    {
        if(n<0)
        {
            return;
        }
        System.out.println(n+"");
        print(n-2);
    }

    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
}
