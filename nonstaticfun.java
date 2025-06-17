public class Nonstaticfun
{
    public  void add(int n)
    {
        if(n==10)return;
        System.out.println(n);
        add(n+1);
        System.out.println(n);
    }
	public static void main(String[] args) {
	    Main m=new Main();
	 m.add(1);
	}
}