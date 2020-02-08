import Home.work.CalcWithOperator;
import Home.work.Calcwithextend;

public class calcwithcounter extends CalcWithOperator {

    private double counter;
private CalcWithOperator calc1;
private Calcwithextend calc2;


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

    

}