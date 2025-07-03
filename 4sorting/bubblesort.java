import java.util.Scanner;

public class bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        System.out.print("Entet "+n+" elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            boolean flag = false;//Flag is used to optimize the code it stops sort operation if the array is already sorted.
            for(int j =0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
        System.out.println("Printing sorted array: ");
        for (int i =0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//time complexity is n^2.