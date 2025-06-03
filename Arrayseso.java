import java.util.*;
public class Arrayseso
{
	public static void main(String[] args) {
	    int [] a=new int [5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int emul=1;
	    int omul=1;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]%2==0){
	            emul*=a[i];
	        }
	        else if(a[i]%2==1)
	        {
	            omul*=a[i];
	        }
	          
	    }
	        System.out.println(emul);
		System.out.println(omul);
	}
}