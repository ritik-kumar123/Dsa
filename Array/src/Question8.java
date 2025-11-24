// remove duplicate element from unsorted array

import java.util.*;
public class Question8
{
    public static void main(String[] args)
    {

        // First method

        int arr[] ={1,6,5,4,5,6,4,0};
//        Arrays.sort(arr);
//        int j=0;
//        int len= arr.length;
//        for(int i=0;i< arr.length-1;i++)
//        {
//            if(arr[i]!= arr[i+1])
//            {
//                arr[j++]=arr[i];
//            }
//            else
//            {
//               len--;
//            }
//        }
//        arr[j++] = arr[arr.length-1];
//  for (int i=0; i<len;i++)
//  {
//      System.out.print(arr[i]);
//  }


        // Second method

        Set<Integer> s= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
               s.add(arr[i]);
        }
         s.forEach(ele -> System.out.print(ele+" "));


        //     Third  method

//        Map<Integer ,Integer> map= new HashMap<>();
//        int len = arr.length;
//        for(int i=0; i<len;i++)
//        {
//            if(map.containsKey(arr[i]))
//            {
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//            else {
//                map.put(arr[i], 1);
//            }
//        }
//
//        map.forEach((key,v) -> System.out.print("("+key +" "+v+")"+" "));

    }

}
