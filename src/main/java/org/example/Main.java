package org.example;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (!PasswordChecker.isValidPassword(password)) {
                System.out.println("Invalid Password!");
            } else {
                if (PasswordChecker.isStrongPassword(password)) {
                    System.out.println("Strong password");
                    break;
                } else {
                    System.out.println("Weak password");
                    break;
                }
            }
        }

        scanner.close();
    }
}
