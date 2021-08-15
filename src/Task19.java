public class Task19 {

    public static void main(String[] args) {
        and(true, false);
        and(true, true);
        and(false, true);
        and(false, false);

    }
    static void and(boolean t, boolean f)
    {
        System.out.println(t && f);
    }
}
