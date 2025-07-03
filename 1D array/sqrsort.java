
import java.lang.*;
import java.util.Scanner;
public class sqrsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left =0,rigth=n-1;
        int[] ans =new int[n];
        int k =n-1;
        while(left<=rigth){
            if(Math.abs(arr[left])>Math.abs(arr[rigth])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else{
                ans[k--] = arr[rigth] * arr[rigth];
                rigth--;
            }
        }
        System.out.println("");
        System.out.print("Output Array: ");
        for(int i = 0; i <n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
