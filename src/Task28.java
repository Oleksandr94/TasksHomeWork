public class Task28 {

    public static void main(String[] args) {

        isPlural("changes");
        isPlural("change");
        isPlural("dudes");
        isPlural("magic");

    }
    static void isPlural(String str)
    {
        System.out.println(str.indexOf('s') >=0);
    }
}
