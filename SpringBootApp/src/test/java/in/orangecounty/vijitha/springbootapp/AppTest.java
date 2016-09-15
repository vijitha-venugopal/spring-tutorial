package in.orangecounty.vijitha.springbootapp;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    public void testGetHello() throws Exception {
        assertEquals("Hello", App.home());
    }
}
