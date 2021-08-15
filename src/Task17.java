public class Task17 {

    public static void main(String[] args) {
        divisibleByFive(5);
        divisibleByFive(-55);
        divisibleByFive(37);

    }
    static void divisibleByFive(double a)
    {
        System.out.println( a % 5 == 0);
    }
}
