public class Index {
    public static void main(String[] args) {

        //String galaxy = "Milky way";

        //trim remove white spaces
        String galaxy = "   \tMilky Way";

        System.out.println(galaxy.trim().indexOf('y'));

        System.out.println(galaxy.indexOf('y'));

        System.out.println(galaxy.indexOf('y', 5));

 ;
    }
}
