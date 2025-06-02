
import java.util.*;
public class EvenOdd
{
	public static void main(String[] args) {
	    int [] a=new int[6];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int ecount=0;
	    int ocount=0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]%2==0)
	        {
	            ecount+=1;
	        }
	        else if(a[i]%2==1)
	        {
	            ocount+=1;
	        }
	    }
	    System.out.println(ecount);
	    System.out.println(ocount);
	}
	
}