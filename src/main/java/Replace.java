public class Replace {
    public static void main(String[] args) {

        String str = "Programing is cool.";
        System.out.println(str);

        String replaced = str.replaceAll("is", "-");
        System.out.println(replaced);

        String replaced2 = str.replaceAll("i", "-");
        System.out.println(replaced2);


        String str2 = "Programing is \t cool.";
        System.out.println(str2.replaceAll("\\w","*")); //replacing any letters

        String str3 = "Programing is cool.";
        System.out.println(str2.replaceAll("A-Za-z","*"));
    }
}
