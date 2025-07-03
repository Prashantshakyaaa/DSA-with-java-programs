import java.util.Scanner;

public class Rotatearray {
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k; i < n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array--");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" elements");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number by which you want to rotate the array");
        int k = sc.nextInt();
        System.out.println("Original allar");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        System.out.println("Rotated array---");
        int[] ans = rotate(arr,k);
        for(int i = 0; i<n;i++){
            System.out.print(ans[i]);
        }
    }
}
