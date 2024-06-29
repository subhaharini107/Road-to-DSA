/*Cyclic sort*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Size:");
		int size=obj.nextInt();
		int [] arr=new int[size];
		System.out.print("Element:");
		for(int i=0;i<size;i++){
		    arr[i]=obj.nextInt();
		}
		cycle(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void cycle(int []arr){
	    int i=0,index;
	    while(i<arr.length){
	       index=arr[i]-1;
	       if(arr[i]!=arr[index]){
	           swap(arr,i,index);
	       }
	       else{
	           i++;
	       }
	    }
	}
	static void swap(int []arr,int first,int last){
	    int temp=arr[first];
	    arr[first]=arr[last];
	    arr[last]=temp;
	}
}
