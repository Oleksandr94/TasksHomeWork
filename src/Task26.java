public class Task26 {

    public static void main(String[] args) {

        comp("AB", "CD");
        comp("ABC", "DE");
        comp("hello", "edabit");
    }
    static void comp(String a, String b)

    {
        int length1 = a.length();
        int length2 = b.length();

        System.out.println(length1 == length2);
    }
}
