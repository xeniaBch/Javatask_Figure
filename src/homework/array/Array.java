package homework.array;

import java.util.Scanner;

public class Array {

   public static  boolean isMultiply(int[]arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j && arr[i] * arr[j] == value) {
                    return true;
                }
            }
        }
        return false;
    }


}
