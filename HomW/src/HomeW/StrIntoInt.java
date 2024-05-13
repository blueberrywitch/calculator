package HomeW;

import java.util.Arrays;
import java.util.Objects;

public class StrIntoInt {
    String[] myArray;
    boolean flag = false;
    int num1;
    int num2;


    public int[] name() {
        int[] arr = new int[2];
        try {
            num1 = Integer.parseInt(myArray[0]);
            num2 = Integer.parseInt(myArray[2]);
            if (num1 > 10 | num2 > 10) {
                num1 = -1;
            }

        } catch (NumberFormatException e) {
            num1 = -1;
            num2 = -1;

        }
        arr[0] = num1;
        arr[1] = num2;
        return arr;
    }
}


