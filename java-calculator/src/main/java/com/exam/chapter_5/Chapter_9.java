package com.exam.chapter_5;

import com.exam.chapter_5.token.Operand;
import com.exam.chapter_5.token.Operator;
import com.exam.chapter_5.token.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수식을 입력하세요: ");
        String formula = scanner.nextLine();

        List<Token> tokens = tokenize(formula);
        int result = calculate(tokens);

        System.out.println("결과: " + result);
    }

    private static List<Token> tokenize(String formula) {
        String[] tokens = formula.split(" ");
        List<Token> parsedTokens = new ArrayList<>();

        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 == 0) { // Operand
                try {
                    int value = Integer.parseInt(tokens[i]);
                    parsedTokens.add(new Operand(value));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid operand: " + tokens[i]);
                }
            } else { // Operator
                parsedTokens.add(new Operator(tokens[i].charAt(0)));
            }
        }

        return parsedTokens;
    }

    private static int calculate(List<Token> tokens) {
        Operand token = (Operand) tokens.get(0);
        int result = token.value();

        for (int i = 1; i < tokens.size(); i += 2) {
            Operator operator = (Operator) tokens.get(i);
            Operand rightOperand = (Operand) tokens.get(i + 1);

            result = operator.operate(result, rightOperand.value());
        }

        return result;
    }
}
