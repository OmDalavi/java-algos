package Algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int a[]){
        int l=a.length;
        int unsortedPartitionIndex=l-1;

        for(unsortedPartitionIndex=l-1;unsortedPartitionIndex>0;unsortedPartitionIndex--){
            for(int i=0;i<unsortedPartitionIndex;i++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        return a;

    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length :");
        int n=sc.nextInt();
        System.out.println("Enter elements :");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sorting.........");
        long start=System.currentTimeMillis();
        a=bubbleSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }





    }
}
