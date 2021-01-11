package sorting;
import java.util.*;
public class Sort_the_Numbers {
	
	  private static void sort(int a[], int n){
	      int cnt0 = 0; 
	      int cnt1 = 0; 
	      int cnt2 = 0;
	      for(int i = 0; i<n; i++){
	         if(a[i] == 0){
	        	 System.out.println(a[i]);
	        	 cnt0++;
	         }else if(a[i] == 1){
	        	 System.out.println(a[i]);
	        	 cnt1++;
	         }else if(a[i] == 2){
	        	 System.out.println(a[i]);
	        	 cnt2++;
	         }
	        	 
	      }
	      System.out.println(cnt0+" "+cnt1+" "+cnt2);
	       for(int i = 0; i<cnt0; i++){
	           a[i] = 0;
	       }
	       for(int i = cnt0; i<(cnt0+cnt1); i++){
	           a[i] = 1;
	       }
	       for(int i = cnt0+cnt1; i<n; i++){
	           a[i] = 2;
	       }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
	      int t = in.nextInt();
	      while(t-->0){
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i<n; i++){
	        	arr[i] = in.nextInt();
	        }
	        sort(arr,n);
	        for(int i : arr)
	        	System.out.print(i+" ");
	        System.out.println();
	      }
	}

}
