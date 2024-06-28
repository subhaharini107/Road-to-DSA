/*Selection Sort*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Size:");
		int size=obj.nextInt();
		System.out.print("Elements:");
		int [] arr=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=obj.nextInt();
		}
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selection(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        int last=arr.length-1-i;
	        int max=max(arr,0,last);
	        swap(arr,max,last);
	    }
	}
	static void swap(int arr[],int max,int last){
	    int temp=arr[max];
	    arr[max]=arr[last];
	    arr[last]=temp;
	}
	static int max(int arr[],int start,int last){
	    int max=start;
	    for(int i=start;i<=last;i++){
	        if(arr[max]<arr[i]){
	            max=i;
	        }
	    }
	    return max;
	}
}
