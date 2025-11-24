// Delete an element from an array
// 1 2 4 5 6

import java.util.Scanner;
public class Question6
{
    public static void main(String[] args)
    {
        int n,pos;
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements in the Array ");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter position to delete an element ");
        pos=sc.nextInt();

        if(pos<0 || pos>n)
        {
            System.out.println("Invalid Position");
        }else
        {
            for (int i=pos-1;i< arr.length-1; i++)
            {
                arr[i] =arr[i+1];
            }
            n--;
            for (int i=0;i< n;i++)
            {
                System.out.print(arr[i]);
            }
        }
    }
}
