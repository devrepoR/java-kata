package com.exam.chapter_1;

import java.util.Scanner;

/**
 * 자바 문법
 * 1. 입력 및 출력
 * 2. 산술 연산자
 * 3. 조건문
 */
public class Calculator_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수식 입력: ");
        String formula = sc.nextLine(); // 2 + 1

        // 1. 공백을 기준으로 분리
        String[] tokens = formula.split(" ");

        // 2. 분리된 토큰을 숫자와 연산자로 구분

        String leftOperand = tokens[0];
        String operator = tokens[1];
        String rightOperand = tokens[2];

        // 3. 연산자에 따라 연산 수행

        int result = 0;

        if("+".equals(operator)) {
            System.out.println("덧셈 연산 : " + leftOperand + " + " + rightOperand);

            result = Integer.parseInt(leftOperand) + Integer.parseInt(rightOperand);
        }

        if("-".equals(operator)) {
            System.out.println("뺄셈 연산 : " + leftOperand + " - " + rightOperand);

            result = Integer.parseInt(leftOperand) - Integer.parseInt(rightOperand);
        }

        if("*".equals(operator)) {
            System.out.println("곱셈 연산 : " + leftOperand + " * " + rightOperand);

            result = Integer.parseInt(leftOperand) * Integer.parseInt(rightOperand);
        }

        if("/".equals(operator)) {
            System.out.println("나누기 연산 : " + leftOperand + " / " + rightOperand);

            result = Integer.parseInt(leftOperand) / Integer.parseInt(rightOperand);
        }

        // 4. 결과 출력
        System.out.println("결과 = " + result);
    }
}
