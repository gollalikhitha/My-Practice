import java.util.*;
public class Arraymul
{
	public static void main(String[] args) {
	    int [] a=new int [5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int mul=1;
	    for(int i=0;i<a.length;i++)
	    {
	          mul*=a[i];
	    }
	        
		System.out.println(mul);
	}
}
