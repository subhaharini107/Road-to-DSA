import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Size:");
		int size=obj.nextInt();
		char []arr=new char[size];
		System.out.print("Elements:");
		for(int i=0;i<size;i++){
		    arr[i]=obj.next().charAt(0);
		}
		System.out.print("Target:");
		char target=obj.next().charAt(0);
		System.out.print("Ceil of letter "+target+" is "+ ceil(arr,target));
	}
	static char ceil(char []arr,char target){
	    int start=0,end=arr.length-1;
	    while(start<=end){
	        int middle=start+(end-start)/2;
	        if(target<arr[middle]){
 	            end=middle-1;
	        }
	        else{
	            start=middle+1;
	        }
	   }
	   if(start == arr.length){
	       return arr[0];
	   }
	   return arr[start];
	   //return arr[start % arr.length];
  }
}
