public class HangmanDrawing {
    public static void draw(int attempts){
        if (attempts == 7) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 6) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println(" 0      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 5) {
            System.out.println(" --------");
            System.out.println(" |      |");
            System.out.println(" 0      |");
            System.out.println("\\       |");
            System.out.println("        |");
            System.out.println("        |");
        }
        if (attempts == 4) {
            System.out.println("  --------");
            System.out.println("  |      |");
            System.out.println("  0      |");
            System.out.println("\\ |      |");
            System.out.println("         |");
            System.out.println("         |");
        }

        if (attempts == 3) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("          |");
            System.out.println("          |");
        }
        if (attempts == 2) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println("          |");
        }
        if (attempts == 1) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println(" /        |");
        }
        if (attempts == 0) {
            System.out.println("  ---------");
            System.out.println("  |       |");
            System.out.println("  0       |");
            System.out.println(" \\|/      |");
            System.out.println("  |       |");
            System.out.println(" / \\      |");

        }
    }
}
