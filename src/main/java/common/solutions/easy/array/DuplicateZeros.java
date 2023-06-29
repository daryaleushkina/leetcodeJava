package common.solutions.easy.array;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if (arr[i] == 0 && i+1 < arr.length) {
                for(int k = arr.length-1;k > i+1; k--) {
                    arr[k]=arr[k-1];
                }
                arr[i+1]= 0;
                i++;
            }
            i++;
        }
        String output = Arrays.toString(arr).replace(" ", "");
        System.out.println(output);
    }
}
