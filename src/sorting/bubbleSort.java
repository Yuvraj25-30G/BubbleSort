package sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void swap(int array[],int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int j = 0; j<n; j++){
            arr[j] = sc.nextInt();
        }

        for(int lastUI = arr.length-1; lastUI > 0; lastUI--){
            for(int i = 0; i<lastUI; i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}