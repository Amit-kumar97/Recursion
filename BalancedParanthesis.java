//---------------Checks if the expression is balanced or not,Do it using recursion.

public class BalancedParanthesis
{
        //---------- Function that print all combinations of
        //---------- balanced parentheses
        //---------- open store the count of opening parenthesis
        //---------- close store the count of closing parenthesis
        static void printParenthesis(char str[], int pos,
        int n, int open,
        int close)
        {
            if (close == n) {
                //------------ print the possible combinations
                for (int i = 0; i < str.length; i++)
                    System.out.print(str[i]);
                System.out.println();
                return;
            }
            else {
                if (open > close) {
                    str[pos] = '}';
                    printParenthesis(str, pos + 1, n, open,
                            close + 1);
                }
                if (open < n) {
                    str[pos] = '{';
                    printParenthesis(str, pos + 1, n, open + 1,
                            close);
                }
            }
        }

        //------------- Wrapper over printParenthesis()
        static void printParenthesis(char str[], int n)
        {
            if (n > 0)
                printParenthesis(str, 0, n, 0, 0);
            return;
        }

        // driver program
        public static void main(String[] args)
        {
            int n = 3;
            char[] str = new char[2 * n];
            printParenthesis(str, n);

        }
}
