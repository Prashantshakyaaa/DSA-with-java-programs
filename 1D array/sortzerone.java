import java.util.Scanner;
public class sortzerone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input with condition: only values 0 and 1 allowed
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + " (only 0 or 1 allowed): ");
                int input = sc.nextInt();

                if (input == 1 || input == 0) {
                    arr[i] = input;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a 0 or 1.");
                }
            }
        }
        int zeros = 0;
        int[] finalarr = new int[n];
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i = 0;i<zeros;i++){
            finalarr[i] = 0;
        }
        for(int i = zeros;i<n;i++){
            finalarr[i] = 1;
        }
        System.out.print("Sorted array---- ");
        for(int i = 0;i<n;i++){
            System.out.print(finalarr[i]+" ");
        }
    }
}