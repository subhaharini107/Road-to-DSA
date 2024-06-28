/* Binary Search*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner obj=new Scanner(System.in);
	     System.out.print("Size:");
	     int size=obj.nextInt();
	     int []arr=new int[size];
	     System.out.print("Element:");
	     for(int i=0;i<size;i++){
	         arr[i]=obj.nextInt();
	     }
	     System.out.print("Target:");
	     int target=obj.nextInt();
	     int num=binary(arr,target);
	     System.out.print("The index of "+target+" is "+num);
	}
	static int binary(int []arr,int n){
	    Arrays.sort(arr);
	    int start=0,end=arr.length-1;
	    while(end>=start){
	        int mid =start+(end-start)/2;
	        if(arr[mid]>n){
	            end=mid-1;
	        }
	        else if(arr[mid]==n){
	            return mid;
	        }
	        else{
	            start=mid+1;
	        }
	    }
	    return -1;
     }
}
