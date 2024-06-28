/*Linear search
Input from user */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner obj=new Scanner(System.in);
	     int size=obj.nextInt();
	     int []arr=new int[size];
	     for(int i=0;i<size;i++){
	         arr[i]=obj.nextInt();
	     }
	     int target=obj.nextInt();
	     int num=linear(arr,target);
	     System.out.println("The index of "+target+" is "+num);
	}
	static int linear(int []arr,int n){
	    int index=0;
	    for(int i=0;i<arr.length;i++){
	        if(n==arr[i]){
	            index = i;
	            break;
	        }
	    }
	    return index;
	}
}
