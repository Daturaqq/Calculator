package com.company.util;

public class GetNum {
    private Keys keys = new Keys();

    public int getNumVal(String str) {
        int num;
        if (keys.getMap().containsKey(str)) {
            num = keys.getMap().get(str);
        } else {
            try {
                num = Integer.parseInt(str);
            } catch (Exception e) {
                num = 0;
            }
        }
        return num;
    }



    public String getRomanNum(int rim) {
        boolean minus = false;
        if (rim < 0) {
            rim *= -1;
            minus = true;
        }
        String rimNum = "";
        while (rim >= 100) {
            rimNum += "C";
            rim -= 100;
        }
        while (rim >= 90) {
            rimNum += "XC";
            rim -= 90;
        }
        while (rim >= 50) {
            rimNum += "L";
            rim -= 50;
        }
        while (rim >= 40) {
            rimNum += "XL";
            rim -= 40;
        }
        while (rim >= 10) {
            rimNum += "X";
            rim -= 10;
        }
        while (rim >= 9) {
            rimNum += "IX";
            rim -= 9;
        }
        while (rim >= 5) {
            rimNum += "V";
            rim -= 5;
        }
        while (rim >= 4) {
            rimNum += "IV";
            rim -= 4;
        }
        while (rim >= 1) {
            rimNum += "I";
            rim -= 1;
        }
        if (minus)
            rimNum = "-" + rimNum;
        return rimNum;
    }
}
