package org.example;

public class PasswordChecker {

    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()-_=+[]{}\\|;:'\",<>/?.";

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 12) return false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && SPECIAL_CHARACTERS.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStrongPassword(String password) {
        if (password.length() < 14) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[a-z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;
        if (password.chars().filter(ch -> SPECIAL_CHARACTERS.indexOf(ch) != -1).count() < 2) return false;
        return password.chars().filter(Character::isLetter).count() >= 6;
    }
}
