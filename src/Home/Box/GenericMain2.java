package Home.Box;

import Massenger.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericMain2 {
    public static void main(String[] args) {
        Person[] pers = new Person[1];
        List<Person> list = new ArrayList<>();

        BoxGeneric<Person> box = new BoxGeneric<>();

    }
        /*GenericMain2 <> box= new BoxGeneric<>();
        box.setItem(Integer.valueOf(1));
        box.setItem(new Box());
        box.setItem(new Person("das","mail","pass"));
        Integer i = (Integer) box.getItem();
        */

    }
