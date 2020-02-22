package Home.Shipping;


import java.util.Scanner;

public class ShippingMain {
    public static void main(String[] args) {
        Scanner Consol = new Scanner(System.in);
        Spare A = new Spare();
        System.out.println("Введите мощность ");
        A.EnginePower = Consol.nextInt();
        System.out.println("Введите объем двигателя ");
        A.EngineV = Consol.nextDouble();
        System.out.println("Бак ");
        System.out.println(A.ENGINENUM);
        System.out.println(A.EnginePower);
        System.out.println(A.tankRaz);

    }


}
