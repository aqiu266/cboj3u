public class Main {
    public static void main(String[] args) {
        System.out.println("PARALLELOG");
        System.out.println(" A        R");
        System.out.println("  R        A");
        System.out.println("   ALLELOGRAM");
        System.out.println();
        System.out.println("  APEZO");
        System.out.println(" R     I");
        System.out.println("TRAPEZOID");
        System.out.println();
        System.out.println("RECTANGLE");
        String word = "RECTANGLE";
        
        for (int i = 1; i <= 7; i++) {
            System.out.println(word.substring(i, i + 1) + "       " + word.substring(8 - i, 9 - i));
        }
      
        System.out.println("ELGNATCER");
        System.out.println();
        System.out.println("   D");
        System.out.println("  III");
        System.out.println(" AAAAA");
        System.out.println("MMMMMMM");
        System.out.println(" OOOOO");
        System.out.println("  NNN");
        System.out.println("   D");
        
    }
}