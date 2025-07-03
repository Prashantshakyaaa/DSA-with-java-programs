public class mergesort {
    static void mergeall(int[] aRr, int l, int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeall(aRr, l , mid);
        mergeall(aRr, mid+1, r);
        merge(aRr, l, mid, r);
    }
    static void merge(int[] aRr, int l,int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left =new int[n1];
        int[] right = new int[n2];
        int i ,j ,k;
        for(i = 0;i<n1;i++) left[i] = aRr[l+i];
        for(j = 0;j<n2;j++) right[j] = aRr[mid+1+j];
        i =0;
        j=0;
        k = l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                aRr[k++] = left[i++];
            }else{
                aRr[k++] = right[j++];
            }
        }
        while(i<n1){
            aRr[k++] = left[i++];
        }
        while(j<n2){
            aRr[k++] = right[j++];
        }
    }
    static void display(int[] aRr){
        for(int i = 0; i < aRr.length;i++){
            System.out.print(aRr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] aRr = {32,4,23,21,2,234,27};
        int n = aRr.length;
        mergeall(aRr, 0,n-1);
        display(aRr);
    }
}
