package HomeW;

import java.util.Arrays;
import java.util.Objects;

public class ArIntoRome {
    String resctring = "";

    String arToRim(int res) {
        if (res < 0) {
            throw new IllegalArgumentException("error");
        }
        int unit = res % 10;
        int tens = res % 100 / 10;
        int hundreds = res / 100;
        switch (unit) {
            case 1: {
                resctring = "I";
                break;
            }
            case 2: {
                resctring = "II";
                break;
            }
            case 3: {
                resctring = "III";
                break;
            }
            case 4: {
                resctring = "IV";
                break;
            }
            case 5: {
                resctring = "V";
                break;
            }
            case 6: {
                resctring = "VI";
                break;
            }
            case 7: {
                resctring = "VII";
                break;
            }
            case 8: {
                resctring = "VIII";
                break;
            }
            case 9: {
                resctring = "IX";
                break;
            }
        }
        switch (tens) {
            case 1: {
                resctring += "X";
                break;
            }
            case 2: {
                resctring += "XX";
                break;
            }
            case 3: {
                resctring += "XXX";
                break;
            }
            case 4: {
                resctring += "XL";
                break;
            }
            case 5: {
                resctring += "L";
                break;
            }
            case 6: {
                resctring += "LX";
                break;
            }
            case 7: {
                resctring += "LXX";
                break;
            }
            case 8: {
                resctring += "LXXX";
                break;
            }
            case 9: {
                resctring += "XC";
                break;
            }
        }
        if (hundreds == 1) {
            resctring = "C";
        }
        return resctring;
    }

    String[] myArray;


    int romenum(String str) {
        int num = 0;
        switch (str) {
            case "I": {
                num = 1;
                break;
            }
            case "II": {
                num = 2;
                break;
            }
            case "III": {
                num = 3;
                break;
            }
            case "IV": {
                num = 4;
                break;
            }
            case "V": {
                num = 5;
                break;
            }
            case "VI": {
                num = 6;
                break;
            }
            case "VII": {
                num = 7;
                break;
            }
            case "VIII": {
                num = 8;
                break;
            }
            case "IX": {
                num = 9;
                break;
            }
            case "X": {
                num = 10;
                break;
            }
            default:{
                num = -1;
            }
        }
        return num;
    }

    int[] romeToAr() {
        int[] arr = new int[2];
        int num1 = romenum(myArray[0]);
        int num2 = romenum(myArray[2]);
        arr[0] = num1;
        arr[1] = num2;
        return arr;
    }

}
