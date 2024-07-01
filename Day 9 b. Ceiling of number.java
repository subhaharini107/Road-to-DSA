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
		System.out.print("Target:");
		int target=obj.nextInt();
		System.out.print("Ceil of "+target+" is "+ceiling(arr,target));
	}
	static int ceiling(int []arr,int target){
	    int start=0,end=arr.length-1;
	    if(target>arr[end]){
	        System.out.print("No ceil value");
	    }
	    while(start<=end){
	        int middle=start+(end-start)/2;
	        if(arr[middle]==target){
	            return arr[middle];
	        }
	        else if(target>arr[middle]){
	            start=middle+1;
	        }
	        else{
	            end=middle-1;
	        }
	   }
	   return arr[start];
  }
}
