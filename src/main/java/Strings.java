public class Strings {
    public static void main(String[] args) {
        String str = "Programing is cool.";

        String substring = str.substring(3);
        System.out.println(substring);
        substring = str.substring(11,14);
        System.out.println(substring);

        System.out.println(str.substring(1,0));
    }
}
