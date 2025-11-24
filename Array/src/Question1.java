// Reverse the array


import java.util.Scanner;
public class Question1
{
    public static void main(String[] args)
    {  int j=0,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++)
        {
            System.out.println("enter "+(i+1)+" value");
            a[i]=sc.nextInt();

        }
        System.out.println("Before reverse");
        for (int l=0;l<a.length;l++)
        {
            System.out.print(a[l]+" ");
        }
        k=a.length-1;
        while (j<k)
        {
            int temp=a[j];
            a[j]=a[k];
            a[k]=temp;
            j++;
            k--;

        }
        System.out.println("after reverse");
        for (int l=0;l<a.length;l++)
        {
            System.out.print(a[l]+" ");
        }


    }
}
