public class Comparison {

    public static void main(String[] args) {
        //true
        String milky1 = "Milky";
        String milky2 = "Milky";
        System.out.println(milky1==milky2);

        //false
        String milky3 = new String("Milky");
        String milky4 = new String("Milky");
        System.out.println(milky3==milky4);

        //true
        String milky5 = "Milky";
        String milky6 = "  Milky".trim();
        System.out.println(milky5.equals(milky6));

        //true
        String milky7 = "Milky";
        String milky8 = "\n     Milky\n".trim();    //n\ - new line
        System.out.println(milky7.equals(milky8));
    }
}
