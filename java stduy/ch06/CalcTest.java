package chapter03.ch06;

public class CalcTest {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc cal = new CompleteCalc();
        System.out.println(num1 + "+ " + num2 + " = " +  cal.add(num1, num2));
        System.out.println(num1 + "+ " + num2 + " = " + cal.sub(num1, num2));
        System.out.println(num1 + "+ " + num2 + " = " + cal.mul(num1, num2));
        System.out.println(num1 + "+ " + num2 + " = " + cal.div(num1, num2));
       
    }
}
