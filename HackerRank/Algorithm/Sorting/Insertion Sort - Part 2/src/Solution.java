import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        for(int i = 1;i<ar.length;i++){
            int current = ar[i];
            for(int j=i-1;j>=0;j--){
                if(current<ar[j]){
                    ar[j+1]=ar[j];
                    if(j==0){
                        ar[j]=current;
                    }
                }
                else{
                    ar[j+1]=current;
                    break;
                }
            }
            printArray(ar);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
