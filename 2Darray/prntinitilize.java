package twoDarray;

public class prntinitilize {
    static void Printthearray(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int [] [] arr2D = new int[3][3];
        arr2D[0][0] = 2; 
        arr2D[0][1] = 2;
        arr2D[0][2] = 2;
        arr2D[1][0] = 2;
        arr2D[1][1] = 2;
        arr2D[1][2] = 2;
        arr2D[2][0] = 2;
        arr2D[2][1] = 2;
        arr2D[2][2] = 2;
        Printthearray(arr2D);
    }
}
