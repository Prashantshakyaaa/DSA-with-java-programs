

public class maxvalarray {
    static void printArray(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }
    static int maxvalue(int[] arr,int idx){
        if(arr.length-1==idx) return arr[idx];
        return Math.max(maxvalue(arr, idx+1), arr[idx]);
    }
    static int sumOfarray(int[] arr, int idx){
        if(arr.length-1==idx) return arr[idx];
        return sumOfarray(arr, idx+1)+arr[idx];
    }
    public static void main(String[] args){
        int[] arr = {2,22,12,1,21,2421,};
        System.out.println("Printed array using recursion:-");
        printArray(arr, 0);
        System.out.println(" ");
        System.out.println("Printed Maximum of the array using recursion:-"+maxvalue(arr, 0));
        System.out.println("The sum of all elements of an array:- "+sumOfarray(arr, 0));
    }
}
