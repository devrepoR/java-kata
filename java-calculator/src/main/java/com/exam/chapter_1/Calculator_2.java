package com.exam.chapter_1;

import java.util.Scanner;

/**
 * 1. 산술 연산자
 * 2. 입력 및 출력
 */
public class Calculator_2 {

    /**
     * 식: formula
     * 연산자: operator
     * 피연산자: operand (좌항: left, 우항: right)
     * 결과: result
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 포맷 : 숫자
        System.out.print("좌항 입력: ");
        int left = sc.nextInt();

        // 입력 포맷 : 숫자
        System.out.print("우항 입력: ");
        int right = sc.nextInt();

        // 출력 포맷 : 숫자
        System.out.println("연산 처리");
        int result = left + right;

        System.out.println("결과 = " + result);
    }
}
