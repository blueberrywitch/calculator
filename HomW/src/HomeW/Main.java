package HomeW;

public class Main {
    public static void main(String[] args) {
        String[] simv;
        boolean flag = true;
        Scaner newArr = new Scaner();
        simv = newArr.parts();
        StrIntoInt s1 = new StrIntoInt();
        s1.myArray = simv;
        int[] resArInt = s1.name();


        if (s1.name()[0] == -1 && s1.name()[1] == -1){
            ArIntoRome resR = new ArIntoRome();
            resR.myArray = simv;
            resArInt = resR.romeToAr();
            if (resArInt[0] == 0 | resArInt[1] == 0) {
                throw new IllegalArgumentException("error");
            }
            flag = false;
        }

        Operation res1 = new Operation();
        res1.myArray1 = simv;
        res1.myArray2 = resArInt;
        int result = res1.res();

        if ((resArInt[0] == -1 && resArInt[1] != -1)){
            throw new IllegalArgumentException("error");
            }
        else {
            if (flag == false){
                ArIntoRome resR = new ArIntoRome();
                System.out.println(resR.arToRim(result));
            }
            else {
                System.out.println(result);
            }
        }
    }
}



