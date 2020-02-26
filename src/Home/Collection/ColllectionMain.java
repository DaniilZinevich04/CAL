package Home.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColllectionMain {
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();//TreeSet<>();///HashSet
        words.add("а");
        words.add("б");
        words.add("в");
        words.add("г");
        words.add("д");
        words.add("я");
        words.add("c");
        words.add("l");
        words.add("y");
        System.out.println(words);
    }
}
