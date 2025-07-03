
import java.util.Scanner;

public class strictlygrtrtX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array:- ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements:-");
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number from which you want to compare--");
        int x = sc.nextInt();
        System.out.println("Your output-:");
        for(int i = 0; i<n;i++){
            if(arr[i]>x){
                System.out.println(arr[i]);
            }
        }
    }
}
