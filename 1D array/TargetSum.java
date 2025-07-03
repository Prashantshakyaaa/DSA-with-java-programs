import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println("Enter the desired sum: ");
        // int x = sc.nextInt();
        // pairs whose sum is X-------------------------------
        // System.out.println("Pairs are:-");
        // for(int i = 0;i<n-1;i++){
        //     int crnt = arr[i];
        //     for(int j = i+1; j<n;j++){
        //         if(crnt+arr[j]==x){
        //             System.out.println("("+ crnt +","+ arr[j]+")");
        //         }
        //     }
        // }
        //--------------------------------------------------------------
        //Triples whose sum is X like (2,3,4)= 9---
        // System.out.println("Triplets are:-");
        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if (arr[i] + arr[j] + arr[k] == x) {
        //                 System.out.println("( " + arr[i] + ", " + arr[j] + ", " + arr[k] + " )");
        //             }
        //         }
        //     }
        // }
        //-----------------------------------------------------------------------------
        // for(int i = 0; i < n-1;i++){
        //     for(int j = i+1;j<n; j++){
        //         if(arr[i] == arr[j]){
        //             arr[i] = -1;
        //             arr[j] = -1;
        //         }
        //     }
        // }
        // System.out.print("Result is ");
        // for(int i = 0; i < n;i++){
        //     if(arr[i] != -1){
        //         System.out.print(arr[i]);
        //     }
        // }
        //------------------------------------------------------------
        // second largest value from the array
        // int largst = Integer.MIN_VALUE;
        // int sndlrgst = Integer.MIN_VALUE;
        // for(int i = 0;i < n-1;i++){
        //     if(largst < arr[i]){
        //         sndlrgst = largst;
        //         largst = arr[i];
        //     } else if(arr[i] < sndlrgst && arr[i] != largst){
        //         sndlrgst = arr[i];
        //     }
        // }
        // if (sndlrgst == Integer.MIN_VALUE) {
        //     System.out.println("No second largest element found.");
        // } else {
        //     System.out.println("Second Largest Value = " + sndlrgst);
        // }
        //-----------------------------------------------------------------
        // First value which repeats
        // for(int i = 0; i<n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println("Repeating value is "+arr[i]);
        //             break;
        //         }
        //     }
        // }
        //-----------------------------------------------------------------
        // Reverse the array
        // System.out.print("Reversed array ={");
        // for(int i = n-1; i>=0;i--){
        //     System.out.print(arr[i]+",");
        // }
        // System.out.print("}");
        //-----------------------------------------------------------------Rotation of array
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        int j=n-1;
        for(int i = 0;i<k-1;i++){
            arr[j--] = arr[i++];
        }
    }    
}
