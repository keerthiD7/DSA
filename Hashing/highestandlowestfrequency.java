package Hasing;
import java.util.*;

public class highestandlowestfrequency {
    public void frequency(int arr[],int n)
    {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put (arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int maxfre=0,minfreq=n;
        int maxele =0,minele=0;

        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            int element = entry.getKey();
            int count = entry.getValue();
            if(count>maxfre)
            {
                maxfre=count;
                maxele=element;
            }
            if(count<minfreq)
            {
                minfreq=count;
                minele=element;
            }
        }
        System.out.println(maxele);
        System.out.println(minele);

    }
    public static void main(String[]args)
    {
        
       highestandlowestfrequency hf = new highestandlowestfrequency();
       int [] arr ={10,5,10,15,10,5};
       hf.frequency(arr,arr.length);
        
    }
    
}
