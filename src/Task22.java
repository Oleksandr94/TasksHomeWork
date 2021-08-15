public class Task22 {

    public static void main(String[] args) {

        profitableGamble(0.2, 50, 9);
        profitableGamble(0.9, 1, 2);
        profitableGamble(0.9, 3, 2);
    }
        static void profitableGamble(double prob, double prize, double pay)
        {
            System.out.println(prob*prize>pay);
        }

}
