public class Task16 {

    public static void main(String[] args) {
        makesTen(9, 10);
        makesTen(9, 9);
        makesTen(1, 9);
        // a+b=10

    }

    static void makesTen(int a, int b) {

            System.out.println(((a == 10)|(b==10)|(a+b==10)));
        }
    }