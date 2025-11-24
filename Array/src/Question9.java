// print subarray
public class Question9
{
    public static void main(String[] args)
    {
        int []a = new int[]{1,3,4,5,6};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }

    }
}
