public class insersionsort {
    public static void main(String[] args){
        int[] arr = {12,34,2,32,13};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
