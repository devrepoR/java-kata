# 문자열 계산기

## Chapter_7

- 목표

- 요구사항

1. 입력 요구사항:

- 사용자로부터 공백을 이용해 구분된 수식을 입력 받아야 한다. 예: 2 + 1 * 3 - 4 / 2
- 피연산자는 정수 형식이다.
- 지원하는 연산자는 +, -, *, /로 제한된다.

2. 토큰 분리 요구사항:

- 입력된 수식을 공백을 기준으로 토큰으로 분리한다.
- 분리된 토큰을 연산자와 피연산자로 구분하여 저장한다.

3. 연산 요구사항:

- 연산자 기호를 기반으로 해당 연산자를 나타내는 Operator 객체를 생성한다.
- 피연산자를 정수로 변환한 후, Operator 객체의 apply 메서드를 사용하여 연산을 수행한다.
- 연산 종류
    - 덧셈: +
    - 뺄셈: -
    - 곱셈: *
    - 나누기: /

4. 출력 요구사항:

- 각 연산의 상세 내용을 출력한다.