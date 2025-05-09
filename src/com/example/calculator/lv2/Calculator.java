package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 *//
    private List<Long> calculatorList = new ArrayList<>();
    //속성

    //생성자

    //기능
    public long calculate(long numbox1, char operator, long numbox2){

        long result = 0;
        switch (operator){
            case '+' :
                result = numbox1 + numbox2;
                calculatorList.add(result); // List가 <Long>이기 때문에 그 외의 자료형은 불가
                break;
            case '-':
                result = numbox1 - numbox2;
                calculatorList.add(result);
                break;
            case '*':
                result = numbox1 * numbox2;
                calculatorList.add(result);
                break;
            case '/':
                if (numbox2 ==0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없습니다. 다시 입력해주세요.");
                } else result = numbox1 / numbox2;
                calculatorList.add(result);
                break;
        }
        return result;
    }
    public List<Long> getcalculatorList(){ // 반환타입이 long이 아닌 List<Long>이라서
       try {
           for (int i = 0; i <= calculatorList.size(); i++)
               System.out.println(i+"번째 결과: "+ calculatorList.get(i));
       } catch (Exception e){

       }
        return  this.calculatorList;
    }

    public void setCalculatorList(List<Long> calculatorList) {
        this.calculatorList = calculatorList;
    }
    public void removeResult(){
        calculatorList.remove(0);
    }
}
