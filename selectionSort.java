package Algorithms;

public class selectionSort {
    public static void main(String [] args){

        int arr[]={5,4,3,9,6,0,-1,5};
        for(int j=arr.length-1;j>0;j--){
            int maxInd=0;
            for(int i=0;i<=j;i++){
                if(arr[maxInd]<arr[i]){
                    maxInd=i;
                }

            }
            int temp=arr[maxInd];
            arr[maxInd]=arr[j];
            arr[j]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }



    }
}
