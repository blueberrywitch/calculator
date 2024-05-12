package HomeW;

public class Operation {
    String[] myArray1;
    int[] myArray2;

    int res() {
        int res = 0;
        switch (myArray1[1]) {
            case "+": {
                res = myArray2[0] + myArray2[1];
                break;
            }
            case "-": {
                res = myArray2[0] - myArray2[1];
                break;
            }
            case "/": {
                res = myArray2[0] / myArray2[1];
                break;
            }
            case "*": {
                res = myArray2[0] * myArray2[1];
                break;
            }
        }
        return res;
    }
}
