package Home;

import java.lang.reflect.Method;

public class ParentMain {

    public static void main(String[] args) {
    Parent parent = new Parent();
    Class<? extends Parent>aClass = parent.getClass();


    }



}

