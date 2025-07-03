
import java.util.Scanner;

public class quicksort {
    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void sortqouic(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        sortqouic(arr, st, pi-1);
        sortqouic(arr, pi+1, end);
    }
    static int partition(int[] arr, int st,int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1;i<=end;i++){
            if(arr[i]<=pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while(i < pivotIdx && j> pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void display(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number of elements of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        display(arr);
        sortqouic(arr, 0, arr.length-1);
        System.out.println("Sorted array");
        display(arr);
    }
}