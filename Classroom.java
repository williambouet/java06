public class Classroom {
  
    public static void main(String[] args) {
        Wilder william = new Wilder("William", false);
        Wilder cedric = new Wilder("Cédric", true);
        
        System.out.println(william.whoAmI());
        System.out.println(cedric.whoAmI());

    }
}
