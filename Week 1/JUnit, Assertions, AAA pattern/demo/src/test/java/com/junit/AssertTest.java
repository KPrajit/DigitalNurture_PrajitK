package com.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AssertTest {
    @Test
    public void assertTest(){
        assertEquals(10,5+5);
        assertTrue(5>3);
        assertFalse(5<3);
        assertNull(null);
        assertNotNull(new Object());

    }
    
}
