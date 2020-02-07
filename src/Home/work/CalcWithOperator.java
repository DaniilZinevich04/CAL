package Home.work;

public class CalcWithOperator implements ICalc{
    int counter1;
    protected int counter2;

   // private final int counter3;
    /*
public CalcWithOperator (){
    counter3 = 66;
}
    три варианта убрать ошибку и инициализировать counter3 + назначить постянное число
    public CalcWithOperator(int counter3) {
        this.counter3 = counter3;
    }
    */

    /*final int plus(int a, int b) {
        return a + b;

    }
*/
    public int minus(int a, int b) {
        return a - b;

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