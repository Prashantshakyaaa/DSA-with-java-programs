

import java.util.ArrayList;

public class linearSearch1{
    // static boolean lsrec(int[] n, int target,int idx){
    //     if(idx >= n.length) return false;
    //     if(n[idx]==target) return true;
    //     return (lsrec(n, target, idx+1));
    // }
    // static int findIndex(int[] n, int target, int idx){
    //     if(idx >= n.length) return -1;
    //     if(n[idx] == target) return idx;
    //     return findIndex(n, target, idx+1);
    // }
    // static void allIndexes(int[] n,int target, int idx){
    //     if(idx == n.length) return;
    //     if(n[idx] == target){
    //         System.out.println(idx);
    //     }
    //     allIndexes(n, target, idx+1);
    // }
    static ArrayList<Integer> findaallIndices(int[] n, int target, int idx){
        if(idx>= n.length) return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(n[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallans = findaallIndices(n, target, idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args){
        int[] n = {234,23,54,325,463,325,32,325};
        int target = 325;
        int idx=0;
        // if(lsrec(n, target, idx)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        // System.out.println("Index is :- "+findIndex(n, target, idx));
        // allIndexes(n,target,idx);
        ArrayList<Integer> ans = findaallIndices(n, target, idx);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
}
