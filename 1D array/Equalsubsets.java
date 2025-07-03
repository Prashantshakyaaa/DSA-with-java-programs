
import java.util.Scanner;

public class Equalsubsets {
    static int findArraySum(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i =0; i<n;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    static Boolean findArraySubsets(int[] arr){
        int totalsum = findArraySum(arr);
        int prefixsum =0;
        for(int i =0;i<arr.length; i++){
            prefixsum = prefixsum+arr[i];
            int postsum = totalsum - prefixsum;
            if(prefixsum == postsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = findArraySubsets(arr);
        if(result) {
            System.out.println("Array can be split into two equal subsets.");
        } else {
            System.out.println("Array cannot be split into two equal subsets.");
        }
    }
}
