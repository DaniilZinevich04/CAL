package Home.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("1");
        words.add("2");
        words.add("3");
        words.add("4");
        words.add("5");

        Iterator<String> iter = words.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());

        }

        //System.out.println("firs word is " + words.get(0));
        //words.remove(0);//удаление элемента
        //System.out.println("first word after remove is " + words.get(0));
       // System.out.println(words.iterator());



    }

}

