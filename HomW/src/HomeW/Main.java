package HomeW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] simv;
        Scaner newArr = new Scaner();
        simv = newArr.parts();
        StrIntoInt s1 = new StrIntoInt();
        s1.myArray = simv;
        Operation res1 = new Operation();
        res1.myArray1 = simv;
        if (s1.name()[0] != -1 && s1.name()[1] != -1) {
            res1.myArray2 = s1.name();
            if (s1.name()[2] == 1) {
                ArIntoRome resR = new ArIntoRome();
                resR.res = res1.res();
                System.out.println(resR.trans());
            } else {
                System.out.println(res1.res());
            }
        } else {
            System.out.println("error");

        }
    }
}


