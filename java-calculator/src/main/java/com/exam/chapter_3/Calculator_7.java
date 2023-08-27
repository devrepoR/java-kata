package com.exam.chapter_3;


import com.exam.chapter_3.strategy.Operator;
import com.exam.chapter_3.strategy.Operators;

import java.util.Scanner;

public class Calculator_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수식 입력: ");
        String formula = sc.nextLine(); // 2 + 1 * 3 - 4 / 2

        // 1. 공백을 기준으로 분리
        String[] tokens = formula.split(" ");

        // 2. 분리된 토큰을 숫자와 연산자로 구분
        String[] operands = new String[tokens.length / 2 + 1];
        String[] operators = new String[tokens.length / 2];

        // 3. 연산자와 피연산자를 분리
        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 == 0) {
                operands[i / 2] = tokens[i];
            } else {
                operators[i / 2] = tokens[i];
            }
        }

        // 4. 순차적으로 연산 수행
        int result = calculate(operands, operators);


        // 5. 결과 출력
        System.out.println("결과 = " + result);
    }

    public static int calculate(String[] operands, String[] operators) {
        int result = Integer.parseInt(operands[0]);

        for (int i = 0; i < operators.length; i++) {
            Operator operator = Operators.fromSymbol(operators[i]);
            int rightOperand = Integer.parseInt(operands[i + 1]);

            System.out.println(operator.getClass().getSimpleName() + " 연산 : " + result + " " + operator.symbol() + " " + rightOperand);

            result = operator.apply(result, rightOperand);
        }

        return result;
    }
}
