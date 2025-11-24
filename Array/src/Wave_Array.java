public class Wave_Array
{
    public static void main(String[] args){
        int[] arr ={1};
        int i=0,j=1;
        while(i<arr.length & j<arr.length)
        {
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j] = temp;
           i+=2;
           j+=2;
        }
        for (int ele: arr) {
            System.out.print(ele);
        }
    }
}