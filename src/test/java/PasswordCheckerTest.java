package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordChecker.isValidPassword("Aa1!Aa1!Aa1!"));
        assertFalse(PasswordChecker.isValidPassword("Short1!"));
        assertFalse(PasswordChecker.isValidPassword("Aa1!Aa1!Aa1!€"));
    }

    @Test
    public void testStrongPassword() {
        assertTrue(PasswordChecker.isStrongPassword("Aa1!Aa1!Aa1!Aa1!"));
        assertFalse(PasswordChecker.isStrongPassword("Aa1!Aa1!Aa1!"));
        assertFalse(PasswordChecker.isStrongPassword("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(PasswordChecker.isStrongPassword("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertFalse(PasswordChecker.isStrongPassword("12345678901234567890"));
        assertFalse(PasswordChecker.isStrongPassword("!@#$%^&*()!@#$%^&*()"));
    }
}
