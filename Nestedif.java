import java.util.*;
class Nestedif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float h=sc.nextFloat();
        float w=sc.nextFloat();
        if(a>12)
        {
            if(h>13)
            {
                if(w>50)
                {
                    System.out.println("passed");
                }
            }
        }
    }
}