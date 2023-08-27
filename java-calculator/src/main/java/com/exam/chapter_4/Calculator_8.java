package com.exam.chapter_4;

import com.exam.chapter_4.token.Operand;
import com.exam.chapter_4.token.Operator;
import com.exam.chapter_4.token.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수식 입력: ");
        String formula = sc.nextLine();

        List<Token> tokens = tokenize(formula);
        int result = calculate(tokens);

        System.out.println("결과 = " + result);
    }

    private static List<Token> tokenize(String formula) {
        String[] rawTokens = formula.split(" ");
        List<Token> tokens = new ArrayList<>();

        for (int i = 0; i < rawTokens.length; i++) {
            if (i % 2 == 0) {
                Operand operand = new Operand(Integer.parseInt(rawTokens[i]));
                tokens.add(operand);
            } else {
                Operator operator = new Operator(rawTokens[i].charAt(0));
                tokens.add(operator);
            }
        }
        return tokens;
    }

    private static int calculate(List<Token> tokens) {
        Operand token = (Operand) tokens.get(0);
        int result = token.value();

        for (int i = 1; i < tokens.size(); i += 2) {
            Operator operator = (Operator) tokens.get(i);
            Operand rightOperand = (Operand) tokens.get(i + 1);

            switch (operator.getOperation()) {
                case '+':
                    result += rightOperand.value();
                    break;
                case '-':
                    result -= rightOperand.value();
                    break;
                case '*':
                    result *= rightOperand.value();
                    break;
                case '/':
                    result /= rightOperand.value();
                    break;
            }
        }

        return result;
    }
}
