// find pairs with given sum in a sorted Array

public class Question4
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int sum= 9,low=0,high= arr.length-1;
        boolean isPairExit= false;
     while (low<high)
        {
            if(arr[low]+arr[high]>sum)
              high--;
            else if (arr[low]+arr[high]<sum) {
                low++;
            } else if (arr[low]+arr[high]==sum) {
                    System.out.println("("+arr[low]+","+arr[high]+")");
                    isPairExit=true;
                    low++;
                    high--;
                }

        }
        if(!isPairExit)
            System.out.println(-1);

    }
}
