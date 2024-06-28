/*Insertion Sort*/
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
		insert(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insert(int []arr){
	    for(int i=0;i<arr.length-1;i++){
	        for(int j=i+1;i>=0;j--){
	            if(arr[j]<arr[j-1]){
	                swap(arr,j,j-1);
	            }
	            else{
	                break;
	            }
	        }
	    }
	}
	static void swap(int arr[],int first,int last){
	    int temp=arr[first];
	    arr[first]=arr[last];
	    arr[last]=temp;
	}
}
