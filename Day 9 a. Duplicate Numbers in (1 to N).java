/*Cyclic sort*/

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
		cyclic(arr);
		//System.out.println(Arrays.toString(arr));
	}
	static void cyclic(int []arr){
	    int i=0,index;
	    while(i<arr.length){
	        index=arr[i]-1;
	        if(arr[index]!=arr[i]){
	            swap(arr,i,index);
	        }
	        else{
	            i++;
	        }
	    }
	    for(int j=0;j<arr.length;j++){
	        if(arr[j]!=j+1){
	            System.out.print(arr[j]+" ");
	        }
	    }
	}
	static void swap(int []arr,int first,int sec){
	    int temp =arr[first];
	    arr[first]=arr[sec];
	    arr[sec]=temp;
	}
}
