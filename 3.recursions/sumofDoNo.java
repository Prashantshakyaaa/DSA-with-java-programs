
import java.util.Scanner;

public class sumofDoNo {
    static int pofq(int p, int q){
        if(q == 0){
            return 1;
        }
        return pofq(p,q-1) * p;
    }
    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        // int smallans = sod(n/10);
        // return smallans + n%10;
        return sod(n/10) +n%10;
         
    }
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter p and q: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int finalans = sod(n);
        System.out.println(finalans);
        System.out.println(pofq(p, q));
    }
}
