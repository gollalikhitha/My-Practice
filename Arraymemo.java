import java.util.*;
public class Arraymemo
{
	public static void main(String[] args) {
	    int [] a=new int [5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int esum=0;
	    int osum=0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]%2==0){
	            esum+=a[i];
	        }
	        else if(a[i]%2==1)
	        {
	            osum+=a[i];
	        }
	          
	    }
	        System.out.println(esum);
		System.out.println(osum);
	}
}