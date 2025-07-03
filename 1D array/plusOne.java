import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (carry > 0) {
            result.add(carry);
        }
        for (int digit : arr) {
            result.add(digit);
        }
        System.out.println("Final output:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}