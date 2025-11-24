// Segregate 0's and 1's in an array
public class Question7
{
    public static void main(String[] args)
    {
        int arr[]={0,1,0,1,0,0,1};
        int low=0,high=arr.length-1;
        while (low<high)
        {
            if(arr[low]==0)
            {
                low++;
            }
           else if(arr[high]==1)
            {
                high--;
            }
           else {
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
