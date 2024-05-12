package HomeW;

import java.util.Arrays;
import java.util.Objects;

public class StrIntoInt {
    String[] myArray;
    boolean flag = false;
    int num1;
    int num2;
    private final String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrIntoInt that = (StrIntoInt) o;
        return num1 == that.num1 && num2 == that.num2 && Objects.deepEquals(myArray, that.myArray) && Objects.deepEquals(rome, that.rome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(myArray), num1, num2, Arrays.hashCode(rome));
    }

    int num = 0;

    int romenum(String args, int n) {
        for (int i = 0; i < 10; i++) {
            if (myArray[n].equals(rome[i])) {
                num = i + 1;
                break;
            } else {
                num = -1;
            }
        }
        return num;
    }

    public int[] name() {
        int[] arr = new int[3];
        try {
            num1 = Integer.parseInt(myArray[0]);
            num2 = Integer.parseInt(myArray[2]);
            if (num1 > 10 | num2 > 10) {
                num1 = -1;
            }
        } catch (NumberFormatException e) {
            num1 = romenum(myArray[0], 0);
            num2 = romenum(myArray[2], 2);
            flag = true;

        }
        arr[0] = num1;
        arr[1] = num2;
        if (flag == true) {
            arr[2] = 1;
        } else {
            arr[2] = 0;
        }

        return arr;
    }
}

