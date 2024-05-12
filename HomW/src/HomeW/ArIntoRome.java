package HomeW;

public class ArIntoRome {
    int res;
    String resctring = " ";

    String trans() {
        if (res < 0) {
            resctring = "error";
            return resctring;
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

}
