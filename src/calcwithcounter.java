import Home.work.CalcWithOperator;
import Home.work.Calcwithextend;
import Home.work.ICal;
import Home.work.ICalc;

public class calcwithcounter extends CalcWithOperator implements ICalc, ICal {

    private double counter;
private CalcWithOperator calc1;
private Calcwithextend calc2;
    private ICalc calc;


public calcwithcounter(ICalc name ){
   this.calc = name ;

}

  /* конструктор
  public calcwithcounter(CalcWithOperator calc){
        this.calc1 =calc;
  }
  public calcwithcounter (Calcwithextend calc){
        this.calc2= calc;

  }

  public double abs(double a) {
        this.counter++;
        if (calc1 != null){
            return calc1.abs(a);
        }
        return calc2.abs(a);
    }

*/

}