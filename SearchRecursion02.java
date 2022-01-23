/*
An array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all the  occurrence(index) 
of search value(7) by holding the index in a result array . 
Do it recursively.
 */
public class SearchRecursion02 {
    public static int[] res(int ar[], int currentindex, int search, int count)
    {
        //-----------base condition
        if (currentindex==ar.length)
        {
            int[] occur =  new int[count];
            return occur;
        }
        if (ar[currentindex]==search)
        {
            int ra[] = res(ar,currentindex+1,search,count+1);
            ra[count] = currentindex;
            return ra;
        }
        else
        {
            int ra[] = res(ar,currentindex+1,search,count);
            return ra;
        }
    }
    public static void main(String[] args) {
        int ar[] = {1,7,3,4,7,7};
        int ans[] = res(ar,0,7,0);
        if(ans.length==0)
        {
            System.out.println("-1");
            return;
        }
        for (int i=0; i<ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
