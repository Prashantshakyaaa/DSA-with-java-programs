public class Selectionsort {
    public static void main(String[] args){
        int[] arr = {324,32,2,34,213};
        int a = arr.length;
        for(int i = 0; i<a-1;i++){
            int minIndex = i;
            for(int j = i+1;j<a;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
