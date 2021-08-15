import java.util.Locale;

public abstract class Task29 {

    public static void main(String[] args) {

        match("hello", "hELLo");
        match("motive", "emotive");
        match("venom", "VENOM");
        match("mask", "mAskinG");

    }

     static void match(String a, String b) {
        System.out.println(a.toLowerCase(Locale.ROOT).equals(b.toLowerCase(Locale.ROOT)));
    }

}

