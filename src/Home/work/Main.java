package Home.work;

public class Main {

    public static void main(String[] args) {
        CalcWithOperator calculator = new CalcWithOperator();
        /*calculator.counter1 =0;
        calculator.counter2 =0;
        calculator.counter3 = 0;
        */
        Calcwithextend calc2 = new Calcwithextend();
        int a =calc2.plus(12,5);
        int b=calc2.plus2(12,22);
        System.out.println(a);
        System.out.println(b);
        System.out.println(CalcWithOperator.se());
        System.out.println(calc2.se());
        System.out.println(calculator.counter1);
        calculator.counter1=10;
        System.out.println(calculator.counter1);


    }
}
