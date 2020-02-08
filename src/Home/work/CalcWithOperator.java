package Home.work;

public class CalcWithOperator implements ICalc{


   /*
public CalcWithOperator (){
    counter3 = 66;
}
    три варианта убрать ошибку и инициализировать counter3 + назначить постянное число
    public CalcWithOperator(int counter3) {
        this.counter3 = counter3;
    }


    public int plus(int a, int b) {
        return a + b;
    }
*/
    public int minus(int a, int b) {
        return a - b;

    }
    public double abs (double a) {
        return Math.abs(a);
    }

    public int muitiple(int a, int b) {
        return a * b;

    }

    public  int divide(int a, int b) {
        return a / b;

    }
    public static int se(){
        return 22;

    }

}
