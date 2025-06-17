
public class StringRecursion
{
    public String  add(int n)
    {
        if(n==10){
        return "biryani";
            
        }
         System.out.println(n);   
        String s=add(n+1);
        System.out.println(n);
        return s;
    }
	public static void main(String[] args) {
	    Main m=new Main();
	 System.out.println(m.add(1));
	}
}