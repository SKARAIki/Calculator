package com.example.calculator;

import java.util.Scanner;

        //Lv1
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
        // 계산기이므로 더 큰 숫자계산을 위해 long 사용했습니다
        // scanner사용하여 숫자를 입력하는 기능을 만들었습니다
        System.out.print("첫번째 숫자를 입력하세요: ");
        long inPutValue1 = scanner.nextInt();
        long numbox1 = inPutValue1;

        System.out.print("사칙연산 기호을 입력하세요: ");
        String addBox = scanner.next();
        char charBox2 = addBox.charAt(0); // 문자열 가장 앞에 있는 문자를 따오는 것
        System.out.print("두번째 숫자를 입력하세요: ");
        long inPutValue2 = scanner.nextInt();
        long numbox2 = inPutValue2;

        //numbox2가 0이 되면 while구문으로 넘어가게
        while (numbox2 == 0){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없습니다. 다시 입력해주세요.");
            System.out.print("두번째 숫자를 입력하세요: ");
            long inPutValue3 = scanner.nextInt();

            numbox2 = inPutValue3; // 새로운 값을 위에서 선언한 변수에 재할당
        }

        // char는 int, String과 달리 Scanner에서 바로 받지 못해 next()를 사용하여
        // String을 Scanner로 받은 다음, charAt(0)로 char형으로 바꾸는 방법을 사용해야한다 - ???

//        String sc = scanner.next();
//        System.out.println("사칙연산 기호 입력: "+ sc);
//        char box = sc.charAt(0);
        // charAt(0)을 쓰는 방법을 찾아서 위와 같이 해보았으나 String을 쓰는게 현재로선 더 편해서 아래와 같이 사용하였습니다

        char add = charBox2;
        String add2 = String.valueOf(add); // 문자를 문자열로 변환
        // if와 else if를 사용하여 매개변수에 .equals로 true와 false를 구분 해, 각 상황에 맞게 연산하도록 구현하였습니다
            if (add2.equals("+")){
                long plusResult = numbox1 + numbox2;
                System.out.println(numbox1+charBox2+numbox2+ "="+ plusResult);
            } else if (add2.equals("-")) {
                long minusResult = numbox1 - numbox2;
                System.out.println(numbox1+charBox2+numbox2+ "="+ minusResult);
            } else if (add2.equals("*")) {
                long mulResult = numbox1 * numbox2;
                System.out.println(numbox1+charBox2+numbox2+ "="+ mulResult);
            } else if (add2.equals("/")) {
                long divResult = numbox1 / numbox2;
                System.out.println(numbox1+charBox2+numbox2+ "="+ divResult);
            }

                System.out.println("더 계산하시겠습니까? 소문자로 써주세요(exit 입력 시 종료)");
                String exitBox = scanner.next();
                if (exitBox.equals("exit")) {
                    break;
                }
            }




        }

    }

