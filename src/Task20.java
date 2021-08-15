public class Task20 {

    public static void main(String[] args) {
        howManyWalls(54, 1, 43);
        howManyWalls(46, 5, 4);
        howManyWalls(100, 4, 5);
        howManyWalls(10, 15, 12);
        howManyWalls(41, 3, 6);

    }
    static void howManyWalls(int n, int w, int h)
    {
        System.out.println(n/(w*h));
    }
}
