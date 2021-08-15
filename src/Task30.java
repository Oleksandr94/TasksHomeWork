public class Task30 {

    public static void main(String[] args) {
        System.out.println (isSafeBridge("####"));;
        System.out.println (isSafeBridge("## ####"));
        System.out.println (isSafeBridge("#"));
        System.out.println (isSafeBridge("### ####"));
        System.out.println (isSafeBridge("#####"));
    }

    private static boolean isSafeBridge(String s)
    {
        return (s== ' ');
    }
}
