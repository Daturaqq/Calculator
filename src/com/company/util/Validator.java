package com.company.util;


public class Validator {
    private String expression;
    private GetNum numeration = new GetNum();
    private String[] split;
    private Keys keys = new Keys();

    public Validator(String input) {
        this.expression = input;
        this.split = expression.split(" ");
    }

    public boolean validate() {
        if (split.length != 3) return false;
        if (!permissibleValue(split[1].charAt(0))) return false;
        int num1 = numeration.getNumVal(split[0]);
        int num2 = numeration.getNumVal(split[2]);
        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) return false;
        if (!equality(split[0], split[2])) return false;
        return true;
    }

    private boolean permissibleValue(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    private boolean equality(String n1, String n2) {
        return (keys.getMap().containsKey(n1) && keys.getMap().containsKey(n2))
                || (!keys.getMap().containsKey(n1) && !keys.getMap().containsKey(n2));
    }

}