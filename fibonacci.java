import java.util.*;
public class fibonacci {

    static int getFib(int n)
    {
        if (n==0 || n==1)return n;
        int l=getFib(n-1);
        int sl=getFib(n-2);
        return l+sl;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("nth fibonacci number is::"+getFib(sc.nextInt()));
        }
    }
}
//0,1,1,2,3,5,8,13,21...

//"""for every n we are callling other 2 recurssions:  2^n Time complexity exponential in nature"""