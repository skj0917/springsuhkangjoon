package use;

import used.SubCalc;      // ← ① AddCalc 를 SubCalc 로 (import 줄)
import used.Calculator;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();   // ← ② new 뒤
        Integer result = calculator.calc(10, 5);
        System.out.println(
                "계산 결과는 " + result + "입니다.");
    }
}
