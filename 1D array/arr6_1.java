
import java.util.Scanner;

public class arr6_1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n =sc.nextInt();
        int[] sis = new int[n];
        System.out.print("Enter the Elements of array: ");
        for(int i= 1; i < n; i++){
            sis[i] =sc.nextInt();
        }
        System.out.println("Enter the starting value where to Start adding:");
        int l = sc.nextInt();
        System.out.println("Where to end");
        int r = sc.nextInt();
        if (l < 0 || r >= n || l > r) {
            System.out.println("Invalid range of indices.");
            return;
        }
        int sum = 0;
        for(int i = l;i<=r;i++){
            sum = sis[i]+sum;
        }
        System.out.println("Result is: "+sum);
    }
}
