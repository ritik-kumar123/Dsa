// find pairs with given sum in a sorted Array

public class Question3
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int sum= 9;
        boolean isPairExit= false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i; j<arr.length;j++)
            {
                if(sum== (arr[i]+arr[j]))
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    isPairExit=true;
                }
            }
        }
        if(!isPairExit)
            System.out.println(-1);

    }
}
