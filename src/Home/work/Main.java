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
        double b = calc2.divide(24,2);
        System.out.println((calc2.divide(12,24)));
        System.out.println(calc2.abs(14));
        System.out.println(calc2.plus(14 , 12));
        System.out.println(b);
        System.out.println(CalcWithOperator.se());
        System.out.println(calc2.se());
       while (1 ==1){
           System.out.println("Говори правду");
       }


    }
}
