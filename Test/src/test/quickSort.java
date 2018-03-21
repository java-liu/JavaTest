/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author lys
 */
public class quickSort {
    public static void main(String[] args){
        int[] a = {5,4,10,7,8,2,1,3,9,6};
        quickSort(a,0,9);
         for(int m =0;m<a.length;m++){
            System.out.print(a[m]+"\t");
        }
    }
    public static void quickSort(int[]a,int left,int right){
        int i ,j ,k ,base;
        if(left>right)
            return;
        base = a[left];
        i = left;
        j = right;
        while(i!=j){
            while(a[j]>=base&&i<j){
                j--;
            }
            while(a[i]<=base&&i<j){
                i++;
            }
            if(i<j){
                k = a[i];
                a[i] = a[j];
                a[j] = k;
            }
        }
        a[left] = a[i];
        a[i] = base;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
      
    }
     
    
}
