public class Task23 {

    public static void main(String[] args) {

        System.out.println(concatName("First", "Last"));
        System.out.println (concatName("John", "Doe"));
        System.out.println (concatName("Mary", "Jane"));

    }
        static String concatName(String firstname, String lastname)
    {
        return lastname + " " + firstname;
    }
}
