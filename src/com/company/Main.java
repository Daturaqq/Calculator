package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       Calculator calculator = new Calculator(input);
       calculator.calculate();
    }
}
