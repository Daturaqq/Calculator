package com.company;

import com.company.util.GetNum;
import com.company.util.Keys;
import com.company.util.Validator;

public class Calculator {
    private GetNum numeration = new GetNum();
    private String[] split;
    private String expression;
    private int num1;
    private int num2;
    private char operation;
    private Validator validator;
    private Keys keys = new Keys();

    public Calculator(String input) {
        this.validator = new Validator(input);
        this.expression = input;
    }

    public void calculate() throws Exception {
        if (!validator.validate()) {
            System.err.println("Ошибка");
            throw new Exception("Не валидный ввод");
        }
        else {
            this.split = expression.split(" ");
            this.num1 = numeration.getNumVal(split[0]);
            this.num2 = numeration.getNumVal(split[2]);
            this.operation = (split[1].charAt(0));

            if (keys.getMap().containsKey(split[0])) {
                calculateRim(num1, num2, operation);
            } else {
                calculateArab(num1, num2, operation);
            }
        }
    }

    private void calculateArab(int num1, int num2, char operation) {
        if (operation == '+')
            System.out.println(plus(num1, num2));
         else if (operation == '-') {
            System.out.println(minus(num1, num2));
        } else if (operation == '*') {
            System.out.println(multi(num1, num2));
        } else if (operation == '/') {
            System.out.println(div(num1, num2));
        }
    }

    private void calculateRim(int num1, int num2, char operation) {
        String rim = "";
        if (operation == '+') {
            rim = numeration.getRomanNum(plus(num1, num2));
        } else if (operation == '-') {
            rim = numeration.getRomanNum(minus(num1, num2));
        } else if (operation == '*') {
            rim = numeration.getRomanNum(multi(num1, num2));
        } else if (operation == '/') {
            rim = numeration.getRomanNum(div(num1, num2));
        }
        System.out.println(rim);
    }

    private int plus(int num1, int num2) {
        return num1 + num2;
    }

    private int minus(int num1, int num2) {
        return num1 - num2;
    }

    private int multi(int num1, int num2) {
        return num1 * num2;
    }

    private int div(int num1, int num2) {
        return num1 / num2;
    }
}