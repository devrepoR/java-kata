package com.exam.chapter_1;

import java.util.Scanner;

/**
 * 자바 문법
 * 1. 입력 및 출력
 * 2. 산술 연산자
 * 3. 조건문
 * 4. 반복문
 */
public class Calculator_4 {

    // 다항 연산 처리
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
        for(int i = 0; i < tokens.length; i++) {
            if(i % 2 == 0) {
                operands[i / 2] = tokens[i];
            } else {
                operators[i / 2] = tokens[i];
            }
        }

        // 4. 순차적으로 연산 수행
        int result = Integer.parseInt(operands[0]);

        for(int i = 0; i < operators.length; i++) {
            String operator = operators[i];
            String rightOperand = operands[i + 1];

            if("+".equals(operator)) {
                System.out.println("덧셈 연산 : " + result + " + " + rightOperand);

                result = result + Integer.parseInt(rightOperand);
            }

            if("-".equals(operator)) {
                System.out.println("뺄셈 연산 : " + result + " - " + rightOperand);

                result = result - Integer.parseInt(rightOperand);
            }

            if("*".equals(operator)) {
                System.out.println("곱셈 연산 : " + result + " * " + rightOperand);

                result = result * Integer.parseInt(rightOperand);
            }

            if("/".equals(operator)) {
                System.out.println("나누기 연산 : " + result + " / " + rightOperand);

                result = result / Integer.parseInt(rightOperand);
            }
        }


        // 5. 결과 출력
        System.out.println("결과 = " + result);
    }
}
