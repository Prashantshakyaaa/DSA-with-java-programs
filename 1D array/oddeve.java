import java.util.Scanner;
public class oddeve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int l =0, r =n-1;
        while(l<r){
            if(arr[l]%2 != 0 && arr[r]%2==0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;l++;
            }
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2!=0){
                r--;
            }
        }
        System.out.print("Sorted array");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
