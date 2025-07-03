import java.util.Scanner;

public class indexolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search for");
        int x = sc.nextInt();
        int count= 0;
        int lastindex = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                lastindex = i;
                count++;
            }
        }
        System.out.println(x+"last occured at "+lastindex);
        System.out.println("occurence is "+count+" times");
    }
}

