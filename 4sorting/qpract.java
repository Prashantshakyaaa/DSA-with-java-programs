public class qpract {
    public static void main(String[] args){
        int[] a = {0, 5, 0, 3, 2, 3};
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(a[j] == 0 && a[j+1]!=0){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Replaced all zeros to end: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
