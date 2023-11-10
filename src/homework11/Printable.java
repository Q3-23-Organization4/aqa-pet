package homework11;

import java.util.function.Function;

public interface Printable {
     static void main(String[] args) {
         Function<String, String> print = String::toUpperCase;

         String result  = print.apply("hello");
         System.out.println(result);
    }
}