package Home.Box;

import Massenger.Person;

public class GenericMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(Integer.valueOf(1));
        box.setItem(new Box());
        box.setItem(new Person("das","mail","pass"));
        Integer i = (Integer) box.getItem();



        NumberGeneric<Integer> boxInt = new NumberGeneric<>();
        NumberGeneric<Integer> boxDouble = new NumberGeneric<>();
        boxInt.setItem(10);
        //NumberGeneric<Integer> boxInt = new NumberGeneric<>();
        boxDouble.setItem(10);
        NumberGeneric<Double> boxDob = new NumberGeneric<>();


    }

    }
