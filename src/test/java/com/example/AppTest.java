package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    //test file
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(8, app.add(5, 3));
    }
}
