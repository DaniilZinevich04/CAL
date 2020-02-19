package Home.work;

import java.util.Scanner;


public class RegEx {
    public static void main(String[] args) {
        /*Scanner r = new Scanner(System.in);
        String str = r.next();
        */
        String [] emails = new String[] {"lncadls@cad.com",""};
        for (String email : emails) {
            email.matches("");
            System.out.println(( email + ": "+ email.matches( ".* ")));
            System.out.println(( email + ": "+ email.matches( " @*.* ")));
            System.out.println(( email + ": "+ email.matches(  "-?[0-9a-zA-Z@._]")));
            System.out.println(( email + ": "+ email.matches(  "[0-9a-zA-Z]{2,}@[0-9a-zA-Z]{2,}\\.[0-9a-zA-Z_]{2,}")));
            System.out.println(( email + ": "+ email.matches(  "@*.[gmail,mail]*.*")));


        }

        }

    }
