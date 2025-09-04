package org.com;

public class Calc {
    static int run(String expr){
        String[] parts = expr.split(" ");

        int result = Integer.parseInt(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int nextNum = Integer.parseInt(parts[i + 1]);

            switch (operator) {
                case "+":
                    result += nextNum;
                    break;
                case "-":
                    result -= nextNum;
                    break;
                case "*":
                    result *= nextNum;
                    break;
            }
        }

        return result;
    }
}