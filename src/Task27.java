public class Task27 {

    public static void main(String[] args) {

        hasSpaces("hello");
        hasSpaces("hello, world");
        hasSpaces(" ");
        hasSpaces("");
        hasSpaces(",./!@#");
    }
    static void hasSpaces(String str)

    {
        System.out.println(str.indexOf(' ') >=0);
    }

}
