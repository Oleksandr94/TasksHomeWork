public class Task25 {

    public static void main(String[] args) {

        returnNegative(4);
        returnNegative(5);
        returnNegative(-54);
        returnNegative(0);
    }
    static void returnNegative (int namber)
    {
        if (namber <=0 ) {
            System.out.println(namber);
        }
        else   {
            System.out.println(namber*(-1));
        }


    }
}
