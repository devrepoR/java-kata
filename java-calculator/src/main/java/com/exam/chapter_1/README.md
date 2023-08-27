# 문자열 계산기

## Chapter_1

- 목표

산술 연산자를 사용하여 덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기를 작성

- 요구사항

정수형 값이 저장되어 있는 변수를 2개 선언하고, 덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기를 작성

- 제약조건

하나의 연산자(operator)와 두 피연산자(operand)로 이루어진 식(formula)을 연산처리

## Chapter_2

- 목표

Java 입력 객체인 Scanner를 사용하여 사용자로부터 값을 입력받아 계산기를 작성

- 요구사항

1. 사용자로부터 더하기 위한 두 피연산자를 입력받는다.
2. 입력받은 두 피연산자를 더한 값을 출력한다.

## Chapter_3

- 목표

사용자로부터 입력 받은 공식을 계산하여 출력하는 계산기를 작성

- 요구사항

1. 사용자로부터 더하기, 빼기, 곱하기, 나누기 연산자와 두 피연산자를 입력받는다.
   1.1 입력받은 연산자가 +, -, *, / 가 아닌 경우 "잘못된 연산자입니다."를 출력한다.
2. 입력받은 두 피연산자를 입력받은 연산자로 계산한다.
3. 계산 결과를 출력한다.

## Chapter_4

- 목표

사용자로부터 입력 받은 공식을 계산하여 출력하는 계산기를 작성

- 요구사항

1. 입력 요구사항:
    - 사용자로부터 수식을 입력 받을 수 있어야 한다.
    - 입력된 수식은 연산자와 피연산자가 교차로 나타나며, 공백으로 구분된다. 예: 2 + 1 * 3 - 4 / 2
    - 피연산자는 정수 형태여야 한다.
    - 지원하는 연산자는 +, -, *, / 이다.

2. 프로세싱 요구사항:
    - 입력된 수식에서 토큰(피연산자, 연산자)을 분리해야 한다.
    - 분리된 토큰을 연산자와 피연산자로 구분한다.

3. 연산 요구사항:
    - 덧셈: +, 뺄셈: -, 곱셈: *, 나누기: /
    - 위의 연산은 수식에 있는 모든 연산자에 대해 순차적으로 수행된다.

4. 출력 요구사항:
   - 연산 결과를 출력한다.