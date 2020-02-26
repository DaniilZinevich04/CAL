package Home.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionMain {
    public static void main(String[] args) {
        Random ran =new Random();
        List<Integer> number = new ArrayList<>();
        //number.add( Math.random(100,200));


        for (int i=0 ; i<10;i++){
            number.add(ran.nextInt(100)+1);
        }
        System.out.println(number);
        for (Integer integer:number){
            integer++;
            System.out.println(integer);
        }
        System.out.println(number);

    }




}
