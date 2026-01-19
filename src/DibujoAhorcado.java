class DibujoAhorcado {
    static void dibujar(int i) {
        String RED_BACKGROUND = "\u001B[41m";
        String YELLOW_BACKGROUND = "\u001B[43m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";
        String PURPLE = "\u001B[35m";
        String WHITE_BACKGROUND = "\u001B[47m";

        switch (i) {
            case 1:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;

            case 2:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        O");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;

            case 3:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        O");
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;

            case 4:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        O");
                System.out.println("  |       /|");
                System.out.println("  |        |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;

            case 5:
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        O");
                System.out.println("  |       /|\\");
                System.out.println("  |        |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;

            case 6:
                System.out.println(YELLOW);
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        O");
                System.out.println("  |       /|\\");
                System.out.println("  |        |");
                System.out.println("  |       / ");
                System.out.println("  |      /  ");
                System.out.println("  |");
                System.out.println("__|__");
                System.out.println(RESET);
                break;

            case 7:
                System.out.println(RED);
                System.out.println("  +--------+");
                System.out.println("  |        |");
                System.out.println("  |        X");
                System.out.println("  |       /|\\");
                System.out.println("  |        |");
                System.out.println("  |       / \\");
                System.out.println("  |      /   \\");
                System.out.println("  |");
                System.out.println("__|__");
                System.out.println(RESET);
                break;
        }
    }
}