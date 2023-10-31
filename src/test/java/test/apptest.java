package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class apptest {
    @Test
    public void testValidUser() {
        assertTrue(app.validate("Shreyas", "Shreyas@123"));
    }

    @Test
    public void testInvalidUser() {
        assertFalse(app.validate("wronguser", "wrongpassword"));
    }
}
