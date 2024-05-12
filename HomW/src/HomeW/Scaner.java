package HomeW;

import java.util.Scanner;

public class Scaner {
    public String[] parts(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scan.nextLine();
        String[] simv = string.split(" ");
        return simv;
    }
}
