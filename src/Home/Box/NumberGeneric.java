package Home.Box;

public class NumberGeneric <T> {
private T item;
public  T getItem() {return  item;}
public void setItem (T item) {this.item = item ;}
public static void printvolue (NumberGeneric<? extends Number>val ){
    System.out.println(val);
}
public static void printNumber (NumberGeneric<? super Number>val ){
    System.out.println(val);
}
public static void printInt (NumberGeneric<? extends Integer>val ){
    System.out.println(val);
}
    public static void printDouble (NumberGeneric<? extends Integer>val ){
    System.out.println(val);
}











}
