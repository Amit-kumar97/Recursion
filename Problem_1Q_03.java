//--------------Code Snippet

public class Problem_1Q_03 {
    
    public static void print(int n)
    {
        if(n>0)
        {
            return;
        }
        if(n==0)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n+"");
        n--;
        print(n);
    }

    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
}
