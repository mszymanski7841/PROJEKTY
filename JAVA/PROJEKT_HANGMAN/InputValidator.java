class InputValidator {
    public static boolean checkSyntax(String letter) {
        if (letter.isEmpty() || !letter.matches("[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]")) {
            return false;
        }
        return true;
    }
}