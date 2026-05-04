package com.java;

import java.util.Arrays;

/* Simple bubble sort program with n square time complexity
* Bubble sort
*/
public class SimpleSort {
    public static void main(String [] args) {
        int [] arr = new int[]{10,4,2,1,6,3,5,13,7,9};
        int temp;
        for(int i =0 ; i<arr.length;i++) {
            for(int j =i+1 ; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
