
import java.util.*;
public class Stringvocons
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int vo=0;
	    int cons=0;
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	            vo+=1;
	        }else{
	            cons+=1;
	        }
	    }
		
		System.out.println(vo);
		System.out.println(cons);
	}
}