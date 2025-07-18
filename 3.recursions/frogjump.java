

import java.util.Scanner;

public class frogjump {
    static int mincost(int[] arr, int n, int idx){
        if(idx == n-1) return 0;
        
        int op1 = Math.abs(arr[idx]-arr[idx+1])+mincost(arr, n, idx+1);
        if(idx == n-2) return op1;
        int op2 = Math.abs(arr[idx]-arr[idx+2])+mincost(arr, n, idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stones: ");
        int n = sc.nextInt();
        System.out.println("Enter the heights of stones: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The min value of the distance that frog have to cover is: "+mincost(arr, n, 0));
    }
}
