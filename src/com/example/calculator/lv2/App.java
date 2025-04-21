package com.example.calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator doCalculate = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 계산기이므로 더 큰 숫자계산을 위해 long 사용했습니다
            // scanner사용하여 숫자를 입력하는 기능을 만들었습니다
            System.out.print("첫번째 숫자를 입력하세요: ");
            long inPutValue1 = sc.nextInt();
            long numbox1 = inPutValue1;

            // 추가로 사칙연산을 제외한 다른 문자를 입력하였을 때 다시 입력하세요. 라는 기능을 넣으려면?

            System.out.print("사칙연산 기호을 입력하세요: ");
            String addBox = sc.next();
            char operator = addBox.charAt(0); // 문자열 가장 앞에 있는 문자를 따오는 것

            System.out.print("두번째 숫자를 입력하세요: ");
            long inPutValue2 = sc.nextInt();
            long numbox2 = inPutValue2;

            //numbox2가 0이 되면 while구문으로 넘어가게
            while (numbox2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없습니다. 다시 입력해주세요.");
                System.out.print("두번째 숫자를 입력하세요: ");
                long inPutValue3 = sc.nextInt();
                numbox2 = inPutValue3; // 새로운 값을 위에서 선언한 변수에 재할당
            }
            doCalculate.getcalculatorList();
            if (operator == '+') {
                long plusResult = doCalculate.calculate(numbox1, operator, numbox2);
                System.out.println(numbox1 + " " + operator + " " + numbox2 + "=" + plusResult);
            } else if (operator == '-') {
                long minusResult = doCalculate.calculate(numbox1, operator, numbox2);
                System.out.println(numbox1 + " " + operator + " " + numbox2 + "=" + minusResult);
            } else if (operator == '*') {
                long mulResult = doCalculate.calculate(numbox1, operator, numbox2);
                System.out.println(numbox1 + " " + operator + " " + numbox2 + "=" + mulResult);
            } else if (operator == '/') {
                double divResult = (double) doCalculate.calculate(numbox1, operator, numbox2);
                System.out.println(numbox1 + " " + operator + " " + numbox2 + "=" + divResult);
            }
            System.out.println("더 계산하시겠습니까? 소문자로 써주세요(exit 입력 시 종료)");
            String exitBox = sc.next();
            if (exitBox.equals("exit")) {
                break;
            }
        }
    }
}