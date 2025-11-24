public class Question11
{
    public static void main(String[] args)
    {
        int []a= new int[]{2,7,11,15};
        int target =18,low=0,high=a.length-1;
        while (low<high)
        {
            if (a[low]+a[high]>target)
                high--;
            else if (a[low]+a[high]<target)
            {
             low++;
            }
            else
            {
                System.out.println( "["+low+" "+high+"]");
                break;
            }
        }
    }
}
