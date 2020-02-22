package Home.Shipping;

import java.util.Scanner;

public interface ISpare {
    int ENGINENUM = 77709;
    double EngineV = 0;
    double EnginePower =0;
    boolean Lock = false;
    double tank = 0;
    double tankRaz = 0 - EnginePower * EngineV / 100;

}
