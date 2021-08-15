public class Task15 {

    public static void main(String[] args) {
        footballPoints(3, 4, 2);
        footballPoints(5, 0, 2);
        footballPoints(0, 0, 1);

    }
    static void footballPoints(int wins, int draws, int losses)
    {
        System.out.println(wins*3+draws*1+losses*0);
    }
}

