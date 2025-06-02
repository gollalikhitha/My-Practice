import java.util.*;
public class Winloss
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n%4==0)
	    {
	        System.out.println("loss");
	    }
	    else{
	        System.out.println("win");
	    }
	}
}