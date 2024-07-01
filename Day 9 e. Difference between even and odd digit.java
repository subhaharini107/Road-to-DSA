import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Number:");
		int num=obj.nextInt();
		boolean flag=true;
		int odd=0,even=0;
		while(num>0){
		    int temp=num%10;
		    if(flag==true){
		        odd=odd+temp;
		    }
		    else{
		        even=even+temp;
		    }
		    flag=!flag;
		    num=num/10;
		}
		System.out.println("The difference between odd and even digit "+Math.abs(odd-even));
	}
}
