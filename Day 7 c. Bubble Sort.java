/* Bubble Sort*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.print("Size:");
      int size=obj.nextInt();
      int []arr=new int[size];
      System.out.print("Elements:");
      for(int i=0;i<size;i++){
          arr[i]=obj.nextInt();
      }
      bubble(arr);
      System.out.println(Arrays.toString(arr));
	}
	static void bubble(int[] arr){
	    boolean swap;
	    for(int i=0;i<arr.length;i++){
	        swap=false;
	        for(int j=1;j<arr.length-i;j++){
	            if(arr[j]<arr[j-1]){
	                int temp=arr[j];
	                arr[j]=arr[j-1];
	                arr[j-1]=temp;
	                swap=true;
	            }
	        }
	        if(swap==false){// to check the array is already sorted or not
	            break;
	        }
	    }
	}
}
